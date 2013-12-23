# android-agile-tools

A small tool-set for agile project management

## About

This is my very first android-project and also my first project on github. I want to build a small app which can help me (and perhaps also you) in the everyday life of agile projects. It will contain some tools for agile project management. Nothing big, but some little helpers combined in a small tool-set.

### Me

My name is Julian Wiersbitzki and I am working in Hamburg at [Holisticon](http://www.holisticon.de). This is my own private project, if you have any questions do not hesitate to ask me here or at [@julianwki](http://twitter.com/julianwki).

### License

This software is released under [THE BEER-WARE LICENSE (Revision 42)](http://en.wikipedia.org/w/index.php?title=Beerware&oldid=558181740):

    /*
     * -------------------------------------------------------------------------------
     * "THE BEER-WARE LICENSE" (Revision 42):
     * <julian@wiersbitzki.com> wrote this file. As long as you retain this notice you
     * can do whatever you want with this stuff. If we meet some day, and you think
     * this stuff is worth it, you can buy me a beer in return.
     * Julian Wiersbitzki, @julianwki
     * -------------------------------------------------------------------------------
     */

## Scope

A small app for Android phones (and probably tablets) which contains little helpers. This includes:

### Planning Poker

A tool in which you can choose your card for planning poker. It should be configurable for scales, eg.:

* Fibonacci-style (0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89) 
* Scale-100 (0, ½, 1, 2, 3, 5, 8, 13, 20, 40, 100)
* T-Shirt-Sizes (XS, S, M, L, XL, XXL)
* optional: coffee break, question mark
* optional: configure your own scale


### Timebox Stop Watch

A tool in which you can choose a timebox amount which is counted backward (*akas* stop watch). It should be configurable for different meetings so you can choose rapidly and start.

## Development

The project is build for the android platform. 

### IDE

Development environment is Eclipse IDE combined with Maven. If someone wants to choose another IDE, it should be easily to do. Therefore unnecassary eclipse specific files should *not* be checked in. A suitable *.gitignore* will be set.

### Continuous Integration

The project will be build automatically on a Jenkins platform at [Cloudbees](https://www.cloudbees.com/) on a regular basis.
