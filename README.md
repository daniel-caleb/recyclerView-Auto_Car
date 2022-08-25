# recyclerView-Auto_Car

Hereby is a Simple RecyclerView in Android using Kotlin.

         #Create a New Layout Resource File
In this file, you can design the layout to show it into the RecyclerView.

         #Create a new Kotlin class-----[Data class]
This file will hold the information of every item which you want to show in your RecyclerView.

         #Create Adapter Class#
This class contains some important functions to work with the RecyclerView these are as follows:

~onCreateViewHolder(): This function sets the views to display the items.

~onBindViewHolder(): This function is used to bind the list items to our widgets such as TextView, ImageView, etc.

~getItemCount(): It returns the count of items present in the list.



A RecyclerView is an advanced version of ListView with improved performance. 

When you have a long list of items to show you can use RecyclerView. 

It has the ability to reuse its views. In RecyclerView when the View goes out of the screen or not visible to the user it won’t destroy it, it will reuse these views. 

This feature helps in reducing power consumption and providing more responsiveness to the application.
