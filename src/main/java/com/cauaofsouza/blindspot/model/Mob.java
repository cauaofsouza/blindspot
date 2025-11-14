package com.cauaofsouza.blindspot.model;
import java.util.Collection;

public record Mob(String name, Collection<String> behaviors, double rarity) {
}
