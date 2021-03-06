import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import { StudentComponent } from './student/student.component';
import { CourseComponent } from './course/course.component';
import { CourseRegistrationComponent } from './course-registration/course-registration.component';


@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    CourseComponent,
    CourseRegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
