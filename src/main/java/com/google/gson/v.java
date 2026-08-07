package com.google.gson;

import bx.a0;
import bx.c0;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v implements w {
    public static final v DOUBLE = new a("DOUBLE", 0);
    public static final v LAZILY_PARSED_NUMBER = new v("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.v.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.v, com.google.gson.w
        public Number readNumber(ex.a aVar) {
            return new a0(aVar.O());
        }
    };
    public static final v LONG_OR_DOUBLE = new v("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.v.c
        {
            a aVar = null;
        }

        private Number parseAsDouble(String str, ex.a aVar) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!aVar.I()) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.C());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e11) {
                throw new JsonParseException("Cannot parse " + str + "; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.v, com.google.gson.w
        public Number readNumber(ex.a aVar) throws IOException {
            String strO = aVar.O();
            if (strO.indexOf(46) >= 0) {
                return parseAsDouble(strO, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strO));
            } catch (NumberFormatException unused) {
                return parseAsDouble(strO, aVar);
            }
        }
    };
    public static final v BIG_DECIMAL = new v("BIG_DECIMAL", 3) { // from class: com.google.gson.v.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.v, com.google.gson.w
        public BigDecimal readNumber(ex.a aVar) throws IOException {
            String strO = aVar.O();
            try {
                return c0.b(strO);
            } catch (NumberFormatException e11) {
                throw new JsonParseException("Cannot parse " + strO + "; at path " + aVar.C(), e11);
            }
        }
    };
    private static final /* synthetic */ v[] $VALUES = $values();

    final enum a extends v {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.v, com.google.gson.w
        public Double readNumber(ex.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    private static /* synthetic */ v[] $values() {
        return new v[]{DOUBLE, LAZILY_PARSED_NUMBER, LONG_OR_DOUBLE, BIG_DECIMAL};
    }

    private v(String str, int i11) {
        super(str, i11);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @Override // com.google.gson.w
    public abstract /* synthetic */ Number readNumber(ex.a aVar);

    /* synthetic */ v(String str, int i11, a aVar) {
        this(str, i11);
    }
}
