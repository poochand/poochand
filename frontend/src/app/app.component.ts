import { Component, OnInit, Inject } from '@angular/core';
 import { HttpClient } from '@angular/common/http';
// import custom validator to validate that password and confirm password fields match

@Component({ selector: 'app', templateUrl: 'app.component.html' })
export class AppComponent implements OnInit {
    ecmsData ={}; 
    

    dataExist = false;
    
    
    constructor(private http:HttpClient) { }

    ngOnInit() {

        this.getReq('http://localhost:8080/creditparams').subscribe((data:any) => {
          console.log(data);
          if(data['messsage']=='Record Exist'){
            this.dataExist=true;
            this.getData();
            console.log(this.ecmsData);
          }else{
            this.dataExist=false;
          }
        },
        (error)=>{
            console.log(error);
        }
        );
      
    }
      getData() {
        this.getReq('http://localhost:8080/creditclaim').subscribe((data: any) => {
          this.ecmsData = data;
          console.log(this.ecmsData);
        });
      }
    
       getReq(url) {
         return this.http.get(url);
       }
    }
    // convenience getter for easy access to form fields

