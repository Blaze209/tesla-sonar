package com.google.gson;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements com.google.gson.d {
    public static final c IDENTITY = new a("IDENTITY", 0);
    public static final c UPPER_CAMEL_CASE = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return c.upperCaseFirstLetter(field.getName());
        }
    };
    public static final c UPPER_CAMEL_CASE_WITH_SPACES = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
        {
            a aVar = null;
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return c.upperCaseFirstLetter(c.separateCamelCase(field.getName(), ' '));
        }
    };
    public static final c UPPER_CASE_WITH_UNDERSCORES = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return c.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };
    public static final c LOWER_CASE_WITH_UNDERSCORES = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
        {
            a aVar = null;
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return c.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final c LOWER_CASE_WITH_DASHES = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
        {
            a aVar = null;
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return c.separateCamelCase(field.getName(), CoreConstants.DASH_CHAR).toLowerCase(Locale.ENGLISH);
        }
    };
    public static final c LOWER_CASE_WITH_DOTS = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
        {
            a aVar = null;
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return c.separateCamelCase(field.getName(), CoreConstants.DOT).toLowerCase(Locale.ENGLISH);
        }
    };
    private static final /* synthetic */ c[] $VALUES = $values();

    final enum a extends c {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public /* bridge */ /* synthetic */ List alternateNames(Field field) {
            return super.alternateNames(field);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    private static /* synthetic */ c[] $values() {
        return new c[]{IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, UPPER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES, LOWER_CASE_WITH_DOTS};
    }

    private c(String str, int i11) {
        super(str, i11);
    }

    static String separateCamelCase(String str, char c11) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c11);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i11 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i11) + upperCase + str.substring(i11 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // com.google.gson.d
    public /* bridge */ /* synthetic */ List alternateNames(Field field) {
        return super.alternateNames(field);
    }

    @Override // com.google.gson.d
    public abstract /* synthetic */ String translateName(Field field);

    /* synthetic */ c(String str, int i11, a aVar) {
        this(str, i11);
    }
}
