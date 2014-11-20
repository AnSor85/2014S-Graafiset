===Balls The Game===

Lets make comments here about big changes to the game.

I created the empty project and created some starting files.
Summary about the files:

MainActivity.java
This file is used only to set up Fragments, and to enable communication between them.
Please do not make any changes here without first examining how the stuff works.

MainMenuFragment.java
This is loaded when the MainActivity first starts. At the moment it only
contains some stuff for the "New game" button. It also contains an
interface for communicating with MainActivity.

GameFragment.java
This file will include code for rendering the game. It loads
"fragment_game.xml" layout that contains an empty SurfaceView.
SurfaceViews run on separate thread for performance, and can be
drawn upon by utilizing canvas and drawables.
