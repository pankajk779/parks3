package com.example.parks3.model;
   public class Times{
   //    escription:Time information for event

       private String sunrisestart;
   //    example: true
   //    Event begins at sunrise

       private String sunsetend;
   //    example: false
   //    Event ends at sunset

       private String timestart;
   //    ($date-time)
   //    Time event begins

       private String timeend;
   //    ($date-time)
   //    Time event ends


       public String getSunrisestart() {
           return sunrisestart;
       }
       public void setSunrisestart(String sunrisestart) {
           this.sunrisestart = sunrisestart;
       }
       public String getSunsetend() {
           return sunsetend;
       }
       public void setSunsetend(String sunsetend) {
           this.sunsetend = sunsetend;
       }
       public String getTimestart() {
           return timestart;
       }
       public void setTimestart(String timestart) {
           this.timestart = timestart;
       }
       public String getTimeend() {
           return timeend;
       }
       public void setTimeend(String timeend) {
           this.timeend = timeend;
       }

   }
