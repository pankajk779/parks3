package com.example.parks3.data;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.parks3.controller.MySingleton;
import com.example.parks3.model.Events;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DummyRepository {
    private static DummyRepository instance;
    private List<Events> events;
    private JSONObject response;
    private List<String> activitesList=new ArrayList<>();
    private String parksDataFrom0to50,
            parksDataFrom0to100,
            parksDataFrom0to150,
            parksDataFrom0to200,
            parksDataFrom0to250,
            parksDataFrom0to300,
            parksDataFrom0to350,
            parksDataFrom0to400,
            parksDataFrom0to450,
            parksDataFrom0to500;
    private String url;
    private List<String> allActivitiesNames, uniqueActivitesList;
    private Context context;


    //    constructor
    private DummyRepository(Context context){
        url="https://developer.nps.gov/api/v1/parks?start=50parkCode=&api_key=sbqXigbqjbO6kcHGdJ8voIDKkeE6KEUUkA82TrAB";
        allActivitiesNames=new ArrayList<>();
        uniqueActivitesList=new ArrayList<>();
        this.context=context;
    }

    public static DummyRepository newInstance(Context context){
        if(instance==null){
            instance =new DummyRepository(context);
        }
        return instance;
    }

//    parse String to json
    private void setEventsfromJsonString() throws JSONException {
        try {
            String responseString="{\"total\":\"1571\",\"errors\":[],\"data\":[{\"location\":\"Daytime events will be at the Ben Reifel Visitor Center.\\nNightly Events will be at the Cedar Pass Amphitheater.\",\"updateuser\":\"\",\"contactname\":\"Ed Welsh\",\"contacttelephonenumber\":\"(605) 433-5244\",\"recurrencedateend\":\"\",\"longitude\":\"-101.941661\",\"datestart\":\"2022-07-29\",\"isrecurring\":\"false\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Festival\"],\"createuser\":\"\",\"isfree\":\"true\",\"contactemailaddress\":\"edward_welsh@nps.gov\",\"regresurl\":\"\",\"description\":\"<p style=\\\"margin: 0in;\\\"><span style=\\\"font-size: 10.5pt; font-family: 'Verdana',sans-serif; color: black;\\\">The festival brings together space science professionals, amateur astronomers, educators, and visitors for a three-day celebration.<\\/span><\\/p>\\n<p style=\\\"margin: 0in;\\\"><span style=\\\"font-size: 10.5pt; font-family: 'Verdana',sans-serif; color: black;\\\"><br \\/> Novices and experts alike will enjoy the spectacular dark night skies of Badlands National Park at public star parties each evening. During the afternoon each day, a variety of family-friendly activities will provide opportunities for visitors to learn about the night sky, the sun, and space exploration. Telescopes will be provided by astronomers from the Black Hills Astronomical Society, Badlands National Park, Dark Ranger Telescope Tours and the University of Utah for day and night observations. <\\/span><\\/p>\\n<p style=\\\"margin: 0in;\\\"><span style=\\\"font-size: 10.5pt; font-family: 'Verdana',sans-serif; color: black;\\\"><br \\/> The schedule of events includes astrophotography workshops, scaled solar system tour and walk, solar observing opportunities, special guest speakers, public stargazing activities, static displays, as well as equipment demonstrations by professional and amateur astronomers. <\\/span><\\/p>\\n<p style=\\\"margin: 0in;\\\"><span style=\\\"font-size: 10.5pt; font-family: 'Verdana',sans-serif; color: black;\\\"> <\\/span><\\/p>\\n<p style=\\\"margin: 0in; font-variant-ligatures: normal; font-variant-caps: normal; orphans: 2; text-align: start; widows: 2; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial; word-spacing: 0px;\\\"><span style=\\\"font-size: 10.5pt; font-family: 'Verdana',sans-serif; color: black;\\\">This free event is made possible through funding and support from the Badlands Natural History Association, NASA South Dakota Space Grant Consortium, Dark Ranger Telescope Tours, Black Hills Astronomical Society, International Dark Sky Association, University of Utah, Badlands National Park Conservancy, and Badlands National Park.<\\/span><\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/87C9ABD3-D847-0A95-378E16EC8CCDAEE3.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35202\",\"altText\":\"A crowd of people at an outdoor amphitheater with a telescope in the foreground.\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\"Guest speaker astronomy program during the Badlands Astronomy Festival.\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/87C9ABD3-D847-0A95-378E16EC8CCDAEE3.jpg\"},{\"path\":\"\\/common\\/uploads\\/event_calendar\\/88625F39-E266-351B-CF82601D019D951F.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35204\",\"altText\":\"Milky way over Badlands formations.\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\"A view of the Milky Way in the Cedar Pass Amphitheater\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/88625F39-E266-351B-CF82601D019D951F.jpg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"88706334-B25A-C7BB-8C041A45EEE9BAB7\",\"isallday\":\"false\",\"dateend\":\"2022-08-01\",\"sitecode\":\"badl\",\"infourl\":\"https:\\/\\/www.nps.gov\\/thingstodo\\/badl-astronomy-festival.htm\",\"times\":[{\"timestart\":\"10:00 AM\",\"timeend\":\"12:00 AM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Badlands National Park\",\"recurrencedatestart\":\"2022-07-29\",\"date\":\"2022-07-29\",\"sitetype\":\"park\",\"feeinfo\":\"\",\"recurrencerule\":\"\",\"dates\":[\"2022-07-29\"],\"datetimecreated\":\"\",\"title\":\"Badlands Annual Astronomy Festival\",\"latitude\":\"43.749080\",\"subjectname\":\"\",\"tags\":[\"Badlands\",\"astronomy\",\"space\",\"dark skies\",\"night skies\",\"Midwest NPS\",\"kids and youth\",\"science\"]},{\"location\":\"Faneuil Hall\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"\",\"recurrencedateend\":\"2022-09-05\",\"longitude\":\"-71.056277\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Living History\",\"Talk\"],\"createuser\":\"\",\"isfree\":\"true\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p>In May of 1854 Federal Marshals arrested Anthony Burns under the 1850 Fugitive Slave Law. Immediately following Burns’ arrest, Bostonians gathered at Faneuil Hall to discuss whether they would abide by this federal law or appeal to a higher law of freedom and liberty for all. The eyes of the nation were firmly fixed upon Boston.<\\/p>\\n<p>Join National Parks of Boston Rangers as we recreate this historic meeting through an interactive program.<\\/p>\\n<p>This program lasts approximately 30minutes to 1hour in the Great Hall of Faneuil Hall. Available for grades 5-12.<\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/AE4FED6F-A758-9F2F-FBFBFB19F2D5A28C.jpeg\",\"credit\":\"NPS Photo\",\"imageId\":\"35474\",\"altText\":\"Ranger dressed in kit speaking to a large group of young people in the Great Hall of Faneuil Hall.\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\"Join us for this Town Meeting about the Rendition of Anthony Burns.\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/AE4FED6F-A758-9F2F-FBFBFB19F2D5A28C.jpeg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"AE64EE29-AD25-0B34-8E896C091F138FBF\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"bost\",\"infourl\":\"https:\\/\\/www.nps.gov\\/thingstodo\\/rocking-the-cradle.htm\",\"times\":[{\"timestart\":\"01:00 PM\",\"timeend\":\"01:30 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Boston National Historical Park\",\"recurrencedatestart\":\"2022-07-30\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"\",\"recurrencerule\":\"DTSTART=20220730T040000Z;UNTIL=20220905T040000Z;FREQ=WEEKLY;WKST=SU;BYDAY=SU,SA;COUNT=0;INTERVAL=1\",\"dates\":[\"2022-07-31\",\"2022-08-06\",\"2022-08-07\",\"2022-08-13\",\"2022-08-14\",\"2022-08-20\",\"2022-08-21\",\"2022-08-27\",\"2022-08-28\"],\"datetimecreated\":\"\",\"title\":\"\\\"Rocking the Cradle\\\" Town Meeting\",\"latitude\":\"42.360033\",\"subjectname\":\"\",\"tags\":[\"Boston African American National Historic Site\",\"Boston National Historical Park\",\"Boston Harbor Islands National and State Park\",\"Boston Harbor Islands\",\"Anthony Burns\"]},{\"location\":\"\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"\",\"recurrencedateend\":\"2022-09-05\",\"longitude\":\"-71.056232\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Living History\",\"Talk\"],\"createuser\":\"\",\"isfree\":\"true\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p>250 years ago, British soldiers opened fire on a crowd at King Street in Boston. Three men lay dead and many more were wounded. Was it a plot to commit murder or self-defense? Should the people of Boston extract vengeance against the soldiers or call for law and order above all else?<\\/p>\\n<p>Have your voice be heard in a Town Meeting debate in historic Faneuil Hall and help decide: vengeance or justice? Join us as we recreate this historic meeting through an interactive program with National Parks of Boston Rangers.<\\/p>\\n<p>This program lasts approximately 30minutes to 1hour in the Great Hall of Faneuil Hall. Available for grades 5-12.<\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/ADFD25C3-0C80-0CF2-2D88A01F9F56FC0B.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35473\",\"altText\":\"Woman in 1700s kit standing in a hall speaking to an audience of visitors sitting down.\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\"Debate \\\"Vengeance\\\" or \\\"Justice\\\" in this Boston Massacre Town Meeting\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/ADFD25C3-0C80-0CF2-2D88A01F9F56FC0B.jpg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"AE0D2063-E912-EC36-CF70064CD3BACFD3\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"bost\",\"infourl\":\"https:\\/\\/nps.gov\\/thingstodo\\/vengeance-or-justice-town-meeting.htm\",\"times\":[{\"timestart\":\"03:00 PM\",\"timeend\":\"03:30 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Boston National Historical Park\",\"recurrencedatestart\":\"2022-07-30\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"\",\"recurrencerule\":\"DTSTART=20220730T040000Z;UNTIL=20220905T040000Z;FREQ=WEEKLY;WKST=SU;BYDAY=SU,SA;COUNT=0;INTERVAL=1\",\"dates\":[\"2022-07-31\",\"2022-08-06\",\"2022-08-07\",\"2022-08-13\",\"2022-08-14\",\"2022-08-20\",\"2022-08-21\",\"2022-08-27\",\"2022-08-28\"],\"datetimecreated\":\"\",\"title\":\"\\\"Vengeance or Justice?\\\" Town Meeting\",\"latitude\":\"42.360053\",\"subjectname\":\"\",\"tags\":[\"Boston National Historical Park\",\"Boston African American National Historic Site\",\"Boston Harbor Islands National and State Park\",\"Boston Harbor Islands\",\"Boston Massacre\"]},{\"location\":\"Spalding Site Visitor Center in Lapwai, ID.\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"208-843-7009\",\"recurrencedateend\":\"2022-10-31\",\"longitude\":\"\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Talk\"],\"createuser\":\"\",\"isfree\":\"true\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p>Join a Ranger for an interpretive program covering a variety of topics about the Nez Perce National Historical Park. Programs change daily. Contact the Visitor Center for more information.<\\/p>\",\"images\":[],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"56289C0F-B93C-F757-672C00CB46A587C9\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"nepe\",\"infourl\":\"\",\"times\":[{\"timestart\":\"01:30 PM\",\"timeend\":\"02:00 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Nez Perce National Historical Park\",\"recurrencedatestart\":\"2022-06-28\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"\",\"recurrencerule\":\"DTSTART=20220628T070000Z;UNTIL=20221031T070000Z;FREQ=DAILY;WKST=SU;COUNT=0;INTERVAL=1\",\"dates\":[\"2022-07-31\",\"2022-08-01\",\"2022-08-02\",\"2022-08-03\",\"2022-08-04\",\"2022-08-05\",\"2022-08-06\",\"2022-08-07\",\"2022-08-08\",\"2022-08-09\",\"2022-08-10\",\"2022-08-11\",\"2022-08-12\",\"2022-08-13\",\"2022-08-14\",\"2022-08-15\",\"2022-08-16\",\"2022-08-17\",\"2022-08-18\",\"2022-08-19\",\"2022-08-20\",\"2022-08-21\",\"2022-08-22\",\"2022-08-23\",\"2022-08-24\",\"2022-08-25\",\"2022-08-26\",\"2022-08-27\",\"2022-08-28\",\"2022-08-29\",\"2022-08-30\"],\"datetimecreated\":\"\",\"title\":\"1:30 pm Ranger Program\",\"latitude\":\"\",\"subjectname\":\"\",\"tags\":[\"ranger program\",\"interpretation\",\"talk\"]},{\"location\":\"Spalding Site Visitor Center in Lapwai, ID.\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"208-843-7009\",\"recurrencedateend\":\"2022-10-31\",\"longitude\":\"-116.822761\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Talk\"],\"createuser\":\"\",\"isfree\":\"true\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p>Join a Ranger for an interpretive program covering a variety of topics about the Nez Perce National Historical Park. Programs change daily. Contact the Visitor Center for more information.<\\/p>\",\"images\":[],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"56149FDF-BC6F-511C-6EAEA60F1E43516E\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"nepe\",\"infourl\":\"\",\"times\":[{\"timestart\":\"11:00 AM\",\"timeend\":\"11:30 AM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Nez Perce National Historical Park\",\"recurrencedatestart\":\"2022-06-28\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"\",\"recurrencerule\":\"DTSTART=20220628T070000Z;UNTIL=20221031T070000Z;FREQ=DAILY;WKST=SU;COUNT=0;INTERVAL=1\",\"dates\":[\"2022-07-31\",\"2022-08-01\",\"2022-08-02\",\"2022-08-03\",\"2022-08-04\",\"2022-08-05\",\"2022-08-06\",\"2022-08-07\",\"2022-08-08\",\"2022-08-09\",\"2022-08-10\",\"2022-08-11\",\"2022-08-12\",\"2022-08-13\",\"2022-08-14\",\"2022-08-15\",\"2022-08-16\",\"2022-08-17\",\"2022-08-18\",\"2022-08-19\",\"2022-08-20\",\"2022-08-21\",\"2022-08-22\",\"2022-08-23\",\"2022-08-24\",\"2022-08-25\",\"2022-08-26\",\"2022-08-27\",\"2022-08-28\",\"2022-08-29\",\"2022-08-30\"],\"datetimecreated\":\"\",\"title\":\"11:00 am Ranger Program\",\"latitude\":\"46.447565\",\"subjectname\":\"\",\"tags\":[\"ranger program\",\"interpretation\",\"talk\"]},{\"location\":\"\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"\",\"recurrencedateend\":\"2022-07-31\",\"longitude\":\"\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Guided Tour\",\"Talk\",\"Walk\"],\"createuser\":\"\",\"isfree\":\"false\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p><strong><u>Ranger Talk (20 Mins) 1:30 pm &amp; 3:30 pm<\\/u><\\/strong> : Join a park ranger for a brief exploration of one of the many important stories here at Jamestown. Each ranger has developed a different presentation exploring different stories. Park staff will meet their audience at the Tercentennial Monument and travel to a specific program location. This program requires limited walking and is perfect for visitors with limited time.    <\\/p>\\n<p><strong>Programs are subject to cancellation due to dangerous weather or staffing changes<\\/strong>.<\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/B8ED961D-DB82-BE92-A6120DB1F90F9967.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35228\",\"altText\":\"National Park Ranger stands before visitors giving a program\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\".\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/B8ED961D-DB82-BE92-A6120DB1F90F9967.jpg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"B8EED362-A7E0-AADE-537303BD1ADB244E\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"jame\",\"infourl\":\"https:\\/\\/www.nps.gov\\/colo\\/ranger-led-programs-schedule.htm\",\"times\":[{\"timestart\":\"01:30 PM\",\"timeend\":\"02:00 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"},{\"timestart\":\"03:30 PM\",\"timeend\":\"04:00 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Historic Jamestowne Part of Colonial National Historical Park\",\"recurrencedatestart\":\"2022-07-09\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"Included with entrance fee\",\"recurrencerule\":\"DTSTART=20220709T040000Z;UNTIL=20220731T040000Z;FREQ=WEEKLY;WKST=SU;BYDAY=SU,TH,FR,SA;COUNT=0;INTERVAL=1|EXDATE=2022-07-30,2022-07-21\",\"dates\":[\"2022-07-31\"],\"datetimecreated\":\"\",\"title\":\"20 minute Ranger-Led Programs (Jamestown)\",\"latitude\":\"\",\"subjectname\":\"\",\"tags\":[]},{\"location\":\"\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"\",\"recurrencedateend\":\"2022-07-31\",\"longitude\":\"\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Guided Tour\",\"Talk\",\"Walk\"],\"createuser\":\"\",\"isfree\":\"false\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p><strong><u>Ranger Talk: (20 mins) 1:30 pm &amp; 3:30 pm<\\/u><\\/strong> : Join a park ranger for a brief exploration into the people, places, and\\/or events in Yorktown during the American War for Independence. Each ranger has developed a different presentation exploring different stories. Park staff will meet their audience at the Regimental Flags in front of the park Visitor Center and travel to a specific program location. This program requires limited walking and is perfect for visitors with limited time.    <\\/p>\\n<p><strong>Programs are subject to cancellation due to dangerous weather or staffing changes<\\/strong>.<\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/B8A3E6F1-B3D4-AD75-9E148CAD860377C2.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35226\",\"altText\":\"National Park Ranger stands before visitors giving a program\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\".\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/B8A3E6F1-B3D4-AD75-9E148CAD860377C2.jpg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"B8A58040-BF73-3FA8-906A4E078AFA8AFD\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"york\",\"infourl\":\"https:\\/\\/www.nps.gov\\/colo\\/ranger-led-programs-schedule.htm\",\"times\":[{\"timestart\":\"01:30 PM\",\"timeend\":\"02:00 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"},{\"timestart\":\"03:30 PM\",\"timeend\":\"04:00 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Yorktown Battlefield Part of Colonial National Historical Park\",\"recurrencedatestart\":\"2022-07-09\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"Included with entrance fee\",\"recurrencerule\":\"DTSTART=20220709T040000Z;UNTIL=20220731T040000Z;FREQ=WEEKLY;WKST=SU;BYDAY=SU,TH,FR,SA;COUNT=0;INTERVAL=1|EXDATE=2022-07-17,2022-07-21\",\"dates\":[\"2022-07-31\"],\"datetimecreated\":\"\",\"title\":\"20 minute Ranger-Led Programs (Yorktown)\",\"latitude\":\"\",\"subjectname\":\"\",\"tags\":[]},{\"location\":\"Parking is available on W Division Street and in the lot on W 2nd Street at the corner of S Pine Street.\",\"updateuser\":\"\",\"contactname\":\"William Mallery\",\"contacttelephonenumber\":\"8707774455\",\"recurrencedateend\":\"2022-10-10\",\"longitude\":\"\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Guided Tour\"],\"createuser\":\"\",\"isfree\":\"true\",\"contactemailaddress\":\"hank_mallery@nps.gov\",\"regresurl\":\"\",\"description\":\"<p>25-minute Guided Tours of President Clinton's Birthplace Home begin at the Visitor Center; there is free parking around the visitor center to accommodate cars, buses, RVs and accessibility needs. Tours will be offered every 45 minutes (No 12:45 Tour Sunday-Friday). Last Tour begins at 3:45 PM. The tour schedule can vary due to staffing levels. Call 870-777-4455 for daily updates.<\\/p>\",\"images\":[],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"FA36251C-DB65-B9C8-3ED382F8EC9A4EAE\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"wicl\",\"infourl\":\"https:\\/\\/www.nps.gov\\/wicl\\/index.htm\",\"times\":[{\"timestart\":\"09:00 AM\",\"timeend\":\"03:45 PM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"Tours of the Birthplace Home will be offered every 45 minutes (No 12:45 Tour Sunday-Friday). Last tour begins at 3:45 PM. The tour schedule can vary due to staffing levels. Call 870-777-4455 for daily updates.\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"President William Jefferson Clinton Birthplace Home National Historic Site\",\"recurrencedatestart\":\"2022-03-12\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"\",\"recurrencerule\":\"DTSTART=20220312T060000Z;UNTIL=20221010T050000Z;FREQ=DAILY;WKST=SU;COUNT=0;INTERVAL=1\",\"dates\":[\"2022-07-31\",\"2022-08-01\",\"2022-08-02\",\"2022-08-03\",\"2022-08-04\",\"2022-08-05\",\"2022-08-06\",\"2022-08-07\",\"2022-08-08\",\"2022-08-09\",\"2022-08-10\",\"2022-08-11\",\"2022-08-12\",\"2022-08-13\",\"2022-08-14\",\"2022-08-15\",\"2022-08-16\",\"2022-08-17\",\"2022-08-18\",\"2022-08-19\",\"2022-08-20\",\"2022-08-21\",\"2022-08-22\",\"2022-08-23\",\"2022-08-24\",\"2022-08-25\",\"2022-08-26\",\"2022-08-27\",\"2022-08-28\",\"2022-08-29\",\"2022-08-30\"],\"datetimecreated\":\"\",\"title\":\"25-Minute Guided Tours of President Clinton's Birthplace Home\",\"latitude\":\"\",\"subjectname\":\"\",\"tags\":[]},{\"location\":\"\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"\",\"recurrencedateend\":\"2022-07-31\",\"longitude\":\"\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Guided Tour\",\"Talk\",\"Walk\"],\"createuser\":\"\",\"isfree\":\"false\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p class=\\\"x_x_MsoNormal\\\"><strong><u>Explore Jamestown (45 mins) 10 am<\\/u><\\/strong> : This ranger guided walk through the historic grounds will highlight the story of Jamestown Island and the development of this colony through the years. Visitors should be prepared for a walk up to one half mile. Limited seating is found along this walk, visitors should plan to stand for much of this presentation. Each ranger-led walk begins at the Tercentennial Monument and includes time exploring new town.   <\\/p>\\n<p class=\\\"x_x_MsoNormal\\\"> <strong>Programs are subject to cancellation due to dangerous weather or staffing changes<\\/strong>.<\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/B8DA0651-A38A-4405-38588874C886B532.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35227\",\"altText\":\"National Park Ranger stands before visitors giving a program\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\".\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/B8DA0651-A38A-4405-38588874C886B532.jpg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"B8DC6485-CD01-5AF1-7C1D0447D30AB93A\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"jame\",\"infourl\":\"https:\\/\\/www.nps.gov\\/colo\\/ranger-led-programs-schedule.htm\",\"times\":[{\"timestart\":\"10:00 AM\",\"timeend\":\"10:45 AM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Historic Jamestowne Part of Colonial National Historical Park\",\"recurrencedatestart\":\"2022-07-09\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"Included with entrance fee\",\"recurrencerule\":\"DTSTART=20220709T040000Z;UNTIL=20220731T040000Z;FREQ=WEEKLY;WKST=SU;BYDAY=SU,TH,FR,SA;COUNT=0;INTERVAL=1|EXDATE=2022-07-30,2022-07-21\",\"dates\":[\"2022-07-31\"],\"datetimecreated\":\"\",\"title\":\"45 minute Ranger-Led Program  (Jamestown)\",\"latitude\":\"\",\"subjectname\":\"\",\"tags\":[]},{\"location\":\"\",\"updateuser\":\"\",\"contactname\":\"\",\"contacttelephonenumber\":\"\",\"recurrencedateend\":\"2022-07-31\",\"longitude\":\"\",\"datestart\":\"2022-07-31\",\"isrecurring\":\"true\",\"datetimeupdated\":\"\",\"portalname\":\"\",\"types\":[\"Guided Tour\",\"Talk\",\"Walk\"],\"createuser\":\"\",\"isfree\":\"false\",\"contactemailaddress\":\"\",\"regresurl\":\"\",\"description\":\"<p><strong><u>Ranger Program: (45 mins) 10:00 am<\\/u><\\/strong> Join a park ranger for a short walk across the battlefield to gain insight into the many aspects of the 1781 Siege of Yorktown. Visitors should be prepared for a walk up to one half mile. Limited seating is found along this walk, visitors should plan to stand for much of this presentation. Each ranger-led walk begins at the Regimental Flags in front of the building    <\\/p>\\n<p><strong>Programs are subject to cancellation due to dangerous weather or staffing changes<\\/strong>.<\\/p>\",\"images\":[{\"path\":\"\\/common\\/uploads\\/event_calendar\\/B878EF96-0AD4-226C-370DBD6D4EBB15AE.jpg\",\"credit\":\"NPS Photo\",\"imageId\":\"35225\",\"altText\":\"National Park Ranger stands before visitors giving a program\",\"title\":\"\",\"ordinal\":\"0\",\"caption\":\".\",\"url\":\"\\/common\\/uploads\\/event_calendar\\/B878EF96-0AD4-226C-370DBD6D4EBB15AE.jpg\"}],\"category\":\"Regular Event\",\"imageidlist\":\"\",\"isregresrequired\":\"false\",\"organizationname\":\"\",\"id\":\"B87A6FD1-D689-8A72-BF3D0B395DFB3183\",\"isallday\":\"false\",\"dateend\":\"2022-07-31\",\"sitecode\":\"york\",\"infourl\":\"https:\\/\\/www.nps.gov\\/colo\\/ranger-led-programs-schedule.htm\",\"times\":[{\"timestart\":\"10:00 AM\",\"timeend\":\"10:45 AM\",\"sunsetend\":\"false\",\"sunrisestart\":\"false\"}],\"regresinfo\":\"\",\"timeinfo\":\"\",\"categoryid\":\"0\",\"eventid\":\"0\",\"parkfullname\":\"Yorktown Battlefield Part of Colonial National Historical Park\",\"recurrencedatestart\":\"2022-07-09\",\"date\":\"2022-07-31\",\"sitetype\":\"park\",\"feeinfo\":\"Included with entrance fee\",\"recurrencerule\":\"DTSTART=20220709T040000Z;UNTIL=20220731T040000Z;FREQ=WEEKLY;WKST=SU;BYDAY=SU,TH,FR,SA;COUNT=0;INTERVAL=1|EXDATE=2022-07-17,2022-07-21\",\"dates\":[\"2022-07-31\"],\"datetimecreated\":\"\",\"title\":\"45 minute Ranger-Led Program  (Yorktown)\",\"latitude\":\"\",\"subjectname\":\"\",\"tags\":[]}],\"dates\":\"2022-08-25,2022-08-12,2022-08-05,2022-08-08,2022-08-24,2022-08-15,2022-08-18,2022-07-31,2022-08-17,2022-08-03,2022-08-27,2022-08-30,2022-08-21,2022-08-14,2022-08-06,2022-08-04,2022-08-26,2022-08-20,2022-08-11,2022-08-01,2022-07-29,2022-08-23,2022-08-10,2022-08-16,2022-08-02,2022-08-29,2022-08-22,2022-08-28,2022-08-13,2022-08-09,2022-08-07,2022-08-19\",\"pagenumber\":\"1\",\"pagesize\":\"10\"}";
            response=new JSONObject(responseString);

            if (response == null) {
                Log.d("MYTAG", "parseStringToJson: response is null");
            } else {
                JSONArray jsonArray = response.getJSONArray("data");
                List<Events> eventsList=Events.fillList(jsonArray);
                Log.d("MYTAG", "parseStringToJson: fillList done succesfully and eventsList size is="+eventsList.size());

                events=eventsList;

                }

        }catch (Exception e){
            Log.d("MYTAG", "parseStringToJson: error in dummyRepository"+e.toString());
        }

    }

    public List<Events> setDummyEvents() throws JSONException {
        if(events==null){
            events=new ArrayList<>();
        }
        setEventsfromJsonString();
        Log.d("MYTAG2", "setDummyEvents: events size is="+events.size());
        return events;
    }

//    sort activites data
    public void sortActivities() throws JSONException {

        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray=response.getJSONArray("data");
                            Log.d("MYTAG", "onResponse: data array length is-"+jsonArray.length());

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject dataObject=jsonArray.getJSONObject(i);
                                JSONArray jsonArray1=dataObject.getJSONArray("activities");
                                Log.d("MYTAG", "onResponse: activities array lenght is-"+jsonArray1.length());
                                for (int j = 0; j < jsonArray1.length(); j++) {
                                    JSONObject jsonObject1=jsonArray1.getJSONObject(j);
                                    String activityName=jsonObject1.getString("name");
                                    Log.d("MYTAG", "sortActivities: activity name is-"+activityName);
                                    allActivitiesNames.add(activityName);


                                }


                            }
                            Log.d("MYTAG", "onResponse: allActivitiesNames size="+allActivitiesNames.size());
                            getUniqueActivites();




                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("MYTAG", "onErrorResponse: error is-"+error.toString());
            }
        });

        MySingleton.getInstance().addToRequestQueue(jsonObjectRequest,context);



    }

    private void getUniqueActivites(){
        int count;
        for (int i = 0; i <allActivitiesNames.size() ; i++) {
            count=1;

            for (int j = i+1; j < allActivitiesNames.size(); j++) {
                if(allActivitiesNames.get(j).equals(allActivitiesNames.get(i))){
                    count++;
                }

            }
            if (count==1&& allActivitiesNames.get(i)!=""){
                uniqueActivitesList.add(allActivitiesNames.get(i));
            }
        }
//        Log.d("MYTAG", "getUniqueActivites: uniqueActivitlist size is-"+uniqueActivitesList.size());
        for (int i = 0; i < uniqueActivitesList.size(); i++) {
//            Log.d("MYTAG", "getUniqueActivites: inside for loop");
            Log.d("MYTAG", "getUniqueActivites: uniqueActivity is- "+uniqueActivitesList.get(i));
        }


    }

}
