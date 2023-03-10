package it.units.sdm.jminesweeper.presentation;

public enum GameStyle {
    FONT("Monospaced"),
    MENU_BACKGROUND_COLOR("#547336"),
    BUTTON_HOVER_BACKGROUND_COLOR("#DFDFDF"),
    MENU_COMPONENT_BACKGROUND_COLOR("#FFFFFF"),
    MENU_LABEL_FOREGROUND_COLOR("#FFFFFF"),
    CELL_HOVER_COLOR("#DCF5B0"),
    COVERED_CELL_LIGHT_BACKGROUND_COLOR("#ACCE5E"),
    COVERED_CELL_DARK_BACKGROUND_COLOR("#B4D565"),
    UNCOVERED_CELL_LIGHT_BACKGROUND_COLOR("#D2B99D"),
    UNCOVERED_CELL_DARK_BACKGROUND_COLOR("#E0C3A3"),
    VICTORY_FREE_CELL_BACKGROUND("#69BFF7"),
    SYMBOL_ONE_COLOR("#296788"),
    SYMBOL_TWO_COLOR("#6DB94A"),
    SYMBOL_THREE_COLOR("#EB3F25"),
    SYMBOL_FOUR_COLOR("#7F1D86"),
    SYMBOL_FIVE_COLOR("#D48E1E"),
    SYMBOL_SIX_COLOR("#4A314D"),
    SYMBOL_SEVEN_COLOR("#7BF9FA"),
    SYMBOL_EIGHT_COLOR("#BFFB5B");

    private final String value;

    GameStyle(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
