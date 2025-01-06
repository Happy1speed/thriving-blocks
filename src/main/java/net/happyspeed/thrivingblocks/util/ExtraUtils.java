package net.happyspeed.thrivingblocks.util;

import net.minecraft.util.math.Direction;

import java.util.Collection;
import java.util.List;

public class ExtraUtils {
    static Collection<Direction> horizontalDirections = List.of(Direction.WEST, Direction.EAST, Direction.SOUTH, Direction.NORTH, Direction.UP);

    public static void init() {
    }

    public static Collection getHorizontalDirections() {
        return horizontalDirections;
    }
}
