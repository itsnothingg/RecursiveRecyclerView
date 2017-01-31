RecursiveRecyclerView
=============
RecyclerView that can expand recursively just like (from sample app):

![alt tag](http://i.giphy.com/l3q2X1iV7YNWMa8Kc.gif)


### Installation
Add the JitPack repository to your build file
<pre><code>allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}</code></pre>
Add the dependency
<pre><code>dependencies {
    compile 'com.github.itsnothingg:RecursiveRecyclerView:1.0.0'
}</code></pre>


### Implementation
implementation is dead simple.
just refer to the sample app and you`ll be able to use it within a minute.

### Todo
- [ ] remembering expanding state when the view is recreated
- [ ] custom expanding & collapsing animations
