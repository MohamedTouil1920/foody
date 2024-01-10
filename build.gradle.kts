// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false

    id ("com.google.gms.google-services") version '4.4.0' apply false

}
Dependency{
    // Import the Firebase BoM
    implementation platform('com.google.firebase:firebase-bom:32.7.0')


    // TODO: Add the dependencies for Firebase products you want to use
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation 'com.google.firebase:firebase-analytics'


    // Add the dependencies for any other desired Firebase products
    // https://firebase.google.com/docs/android/setup#available-libraries
}
