# Project Title
The  Conway's Game of life is a zero player cellular automation game which means that it's evolution is based on it's initial state. 

   
   The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, alive or dead, (or populated and unpopulated, respectively). Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:

   Any live cell with fewer than two live neighbors dies, as if by underpopulation.
   Any live cell with two or three live neighbors lives on to the next generation.
   Any live cell with more than three live neighbors dies, as if by overpopulation.
   Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed; births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick. Each generation is a pure function of the preceding one. The rules continue to be applied repeatedly to create further generations. 
## Getting Started

Firstly, fork the repository and clone it. Open the folder and rename the nandtotetris folde as src. Make sure to run it on netbeans 8.2. Add the project as an existing project in the open tab in the netbeans IDE.
Once you get the code working, you are ready.

### Prerequisites

The following are a few prerequisites required.

```
* Knowldege of object-oriented-programming
* Basic usage of swings.
* Knowledge on Java
```


## Screenshots

![alt text](https://github.com/abhinavdv/Conways-Game-of-life/blob/master/Screenshot%20from%202018-11-06%2022-55-57%20-%201.png "Logo Title Text 1")
![alt text](https://github.com/abhinavdv/Conways-Game-of-life/blob/master/Screenshot%20from%202018-11-06%2022-56-45.png "Logo Title Text 1")


## Built With

* java version "1.8.0_191"
* Java(TM) SE Runtime Environment (build 1.8.0_191-b12)
* Java HotSpot(TM) 64-Bit Server VM (build 25.191-b12, mixed mode)
* netbeans 8.2

## Use cases
The following are some of the most important usecases for the Conway's game of life:

* Use-case1 =>
             * 1. User puts in a pattern which is destructive
             * 2. Presses start 
             * 3. Watches life diminishing for next few frames
             * 4. Life completely diminishes thereby killing the entire species
             * 5. The palyer shuts down

* Use-case2 => 
             * 1. User puts in a pattern which keeps growing throughout
             * 2. Presses start
             * 3. Watches life grow
             * 4. Suddenly growth stops since the cells hit the corner of the screen
             * 5. A different pattern is formed which either disappears or becomes a recursive pattern.
             * 6. The player shuts down the game.

* Use-case3 => 
             * 1. User puts in a pattern which keeps growing throughout
             * 2. Presses start
             * 3. Watches life grow
             * 4. Suddenly growth stops since the cells hit the corner of the screen
             * 5. He presses one of the keys and alters the state.
             * 6. A different pattern is formed which either disappears or becomes a recursive pattern.
             * 7. The player shuts down the game.

There are more usecases to this game other than this. They have not been mentioned here so that this page does not look cluttered.




## Authors

* **Abhinav Duvvuri** -  [abhinavdv](https://github.com/abhinavdv)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Thanks to John Horton Conway for inventing the game
* [wikipedia](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)


