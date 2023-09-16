![Dark_Music_App](https://github.com/amipatel1708/MAD_Practical-6_21012011065/assets/139481113/0d9f4134-4bc7-4852-821a-e727f7f16a15)# MAD_Practical-6_21012011065

# Study: 
Service, Types of Service, Drawable Icon Add in project, MediaPlayer, Add Raw folder, Add mp3 song in raw folder

# AIM: 

* What is Service?

A Service is an application component that can perform long-running operations in the background. It does not provide a user interface. Once started, a service might continue running for some time, even after the user switches to another application. Additionally, a component can bind to a service to interact with it and even perform interprocess communication (IPC). For example, a service can handle network transactions, play music, perform file I/O, or interact with a content provider, all from the background.

* Write down types of Service.

* These are the three different types of services:

* 1. Foreground
A foreground service performs some operation that is noticeable to the user. For example, an audio app would use a foreground service to play an audio track. Foreground services must display a Notification. Foreground services continue running even when the user isn't interacting with the app.

When you use a foreground service, you must display a notification so that users are actively aware that the service is running. This notification cannot be dismissed unless the service is either stopped or removed from the foreground.

* 2. Background
A background service performs an operation that isn't directly noticed by the user. For example, if an app used a service to compact its storage, that would usually be a background service.
Note: If your app targets API level 26 or higher, the system imposes restrictions on running background services when the app itself isn't in the foreground. In most situations, for example, you shouldn't access location information from the background. Instead, schedule tasks using WorkManager.

* 3. Bound
A service is bound when an application component binds to it by calling bindService(). A bound service offers a client-server interface that allows components to interact with the service, send requests, receive results, and even do so across processes with interprocess communication (IPC). A bound service runs only as long as another application component is bound to it. Multiple components can bind to the service at once, but when all of them unbind, the service is destroyed.
Although this documentation generally discusses started and bound services separately, your service can work both ways—it can be started (to run indefinitely) and also allow binding. It's simply a matter of whether you implement a couple of callback methods: onStartCommand() to allow components to start it and onBind() to allow binding.

Regardless of whether your service is started, bound, or both, any application component can use the service (even from a separate application) in the same way that any component can use an activity—by starting it with an Intent. However, you can declare the service as private in the manifest file and block access from other applications. This is discussed more in the section about Declaring the service in the manifest.

* Create an MP3 player application by using service by following below instructions.

* Create MainActivity and design according to shown in below image. 

* Create Service Class and implement MediaPlayer Object.

# OUTPUT 

* LIGHT THEME

![Light_Music_App](https://github.com/amipatel1708/MAD_Practical-6_21012011065/assets/139481113/978998f7-f023-47c4-a571-438f79e38720)

* DARK THEME
  
![Uploading Dark_Music_App.jpg…]()
