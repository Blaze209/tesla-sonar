package gp;

/* JADX INFO: loaded from: classes4.dex */
public enum d {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    d(boolean z11) {
        this._defaultState = z11;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (d dVar : values()) {
            if (dVar.enabledByDefault()) {
                mask |= dVar.getMask();
            }
        }
        return mask;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i11) {
        return (i11 & this._mask) != 0;
    }

    public int getMask() {
        return this._mask;
    }
}
