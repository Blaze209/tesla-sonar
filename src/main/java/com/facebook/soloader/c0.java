package com.facebook.soloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class c0 {
    private static boolean a(String str) {
        Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        p.g("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
        return true;
    }

    public static b0 b(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        b0 b0Var;
        if (unsatisfiedLinkError.getMessage() != null && unsatisfiedLinkError.getMessage().contains("ELF")) {
            p.a("SoLoader", "Corrupted lib file detected");
            b0Var = new y(str, unsatisfiedLinkError.toString());
        } else if (a(str)) {
            p.a("SoLoader", "Corrupted lib name detected");
            b0Var = new z(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
        } else {
            b0Var = new b0(str, unsatisfiedLinkError.toString());
        }
        b0Var.initCause(unsatisfiedLinkError);
        return b0Var;
    }
}
