# Restaurant Map App
# Final Project - *Restaurant Map*

**Restaurant Map app** is an android app. For example: If a user wants to organize a party, the user, generally opens the Yelp App and checks all the places that are favourable for him/her to plan for lunch, dinner or Breakfast. With the "Restaurant Map" app, the user gets the nearby restaurants,based on the current location.
This app uses the Yelp API to retrieve information on the Ratings and Location, the Name of the Place and the type of Food i.e, if the Food is Mexican, or a Pizza place, or Fast Food or Wine Bars, or if Korean food is being served at the Restaurant.
This android app uses device's location information to fetch nearby restaurants via Yelp API and get map information of restaurants.
you don't have to ask anyone anything or worry about what to pick. Restaurant Map searches for places to eat near you and picks one at random.

If you don't like the place it finds, swipe it to the left to get a new one.
If you find a restaurant, you like, Swipe it to the right to open it in Yelp and check out more info. If you find a place that you're thinking about, and not sure about it, then, you can Add it to your saved list by clicking on the bookmark icon to access it later.
It uses the [Yelp API](https://www.yelp.com/developers) to query for restaurants and uses [Google Play Services location API](https://developers.google.com/android/reference/com/google/android/gms/location/package-summary). It also uses [Google Maps Android API](https://developers.google.com/maps/documentation/android-api/) for displaying the location of a restaurant.

Submitted by : Swati Singh

App Flow - 
User Sign up / Login in the App as a Person, this second registered on Yelp as required
User 1: Any Person that would use the app to contact or get a service from any a business registered on Yelp. This user will use the email as “User Name” and define a password to Sign up on our App.Then, They can Log in on the app with the same information registered

Flow for the User 1:
Once the user 1 was registered on our app the app will show the list of Restaurants based on the current location.
User can communicate with Yelp via Yelp API and get nearby restaurants, using the PinCode, City Name or Current Location.
User can tap a restaurant in the map and bring up a new screen to show the direction on map.
- Filter your searches by entering a category or type of food you like (Indian, Vietnamese, Thai, etc).
 - Ability to use your GPS for places near you or enter a location manually to search a specific area.
 - Save restaurants to access them later if you want to narrow down your choices.
 - Ability to open the restaurant's page in Yelp for more information.
 - Displays a mini Google Maps to show where the restaurant is and to get quick directions to it.

## User Stories

The following **required** functionality is completed:

* [x]	User can **sign in to the app** using OAuth login, via Email.
* [x]	User can **view thge list of places from their based on the search criteria.
  * [x] User is displayed the username, name, and body for each recent activity.
  * [x] User can view more media as they scroll with [infinite pagination](http://guides.codepath.com/android/Endless-Scrolling-with-AdapterViews-and-RecyclerView). Number of images is unlimited.
  * [x] User can click a “Show All” icon to search for the places, and populate the results in the Google Map View.
* [x] Request location information from device
* [x] Enable [Swipe Refresh Layout](https://guides.codepath.com/android/Implementing-Pull-to-Refresh-Guide#listview-with-swiperefreshlayout), with List View.
* [x] Filter your searches by entering a category or type of food you like (perfect for vegans).
* [x] Ability to use your GPS for places near you or enter a location manually to search a specific area.
* [x] Save restaurants to access them later if you want to narrow down your choices.
* [x] Ability to open the restaurant's page in Yelp for more information.
* [x] Displays a mini Google Maps to show where the restaurant is and to get quick directions to it.

The following **optional** features are implemented:

* [x] User can **click a select the Place within the app ** and will be redirected to the Map view, below the restaurant name, with its location and the directions.
* [x] Persisted in SQLite, items are refreshed on every application launch. While "live data" is displayed when app can get it from, it is also saved for use in offline mode.
* [x] User can tap a media to **open a detailed media view in browser**
* [x] User can Login using Parse.
* [x] Improve style of the restaurants in the list [using a custom adapter]
* [x] Use fragment instead of new Activity to show the saved list of restaurants
* [x] Implement Google Map functionalities
* [x] Get location information from device.
* [x] Analysis of response data from Yelp

The following **bonus** features are implemented:
* [x] Add support to show all restaurants in the same map
* [x] User can see embedded image media within the media fragment list view
* [x] Use Parcelable instead of Serializable using the popular [Parceler library](http://guides.codepath.com/android/Using-Parceler).
* [x] Replace all icon drawables and other static image assets with [vector drawables](http://guides.codepath.com/android/Drawables#vector-drawables) where appropriate.
* [x] Leverages the [data binding support module](http://guides.codepath.com/android/Applying-Data-Binding-for-Views) to bind data into layout templates.
* [x] Enable your app to [receive implicit intents](http://guides.codepath.com/android/Using-Intents-to-Create-Flows#receiving-implicit-intents) from other apps.  When a link is shared from a web browser, it should pre-fill the text and title of the web page when composing a tweet.
* [x] Apply the popular [Butterknife annotation library](http://guides.codepath.com/android/Reducing-View-Boilerplate-with-Butterknife) to reduce view boilerplate.

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

Video Walkthrough - http://imgur.com/gT0Vrq6
GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.

Team Size = 1
This is a Solo Project, developed within the last few days of Submitting the Final Project

## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Picasso](http://square.github.io/picasso/) - Image loading and caching library for Android


## License

    Copyright [2016] [Swati Singh]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
