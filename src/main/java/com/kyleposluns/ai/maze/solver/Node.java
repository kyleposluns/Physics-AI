package com.kyleposluns.ai.maze.solver;

import java.util.Map;

public interface Node {

	Map<Node, Double> getConnections();

}