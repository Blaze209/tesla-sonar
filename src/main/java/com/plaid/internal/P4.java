package com.plaid.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class P4 {
    public static String a(String input) {
        String string;
        String string2;
        p013kotlin.jvm.internal.s.k(input, "input");
        com.google.gson.l lVarC = com.google.gson.o.c(input);
        if (lVarC.g()) {
            com.google.gson.i iVarA = lVarC.a();
            p013kotlin.jvm.internal.s.j(iVarA, "getAsJsonArray(...)");
            for (com.google.gson.l lVar : iVarA) {
                if (lVar.i()) {
                    com.google.gson.n nVarB = lVar.b();
                    p013kotlin.jvm.internal.s.h(nVarB);
                    if (nVarB.o("meta")) {
                        com.google.gson.l lVarQ = nVarB.q("meta");
                        if (lVarQ.i()) {
                            Set<String> setP = lVarQ.b().p();
                            p013kotlin.jvm.internal.s.j(setP, "keySet(...)");
                            string2 = p013kotlin.collections.v.y0(setP, null, null, null, 0, null, null, 63, null);
                        } else {
                            string2 = lVarQ.toString();
                            p013kotlin.jvm.internal.s.j(string2, "toString(...)");
                        }
                        nVarB.l("meta", string2);
                    }
                    if (nVarB.o("balance")) {
                        com.google.gson.l lVarQ2 = nVarB.q("balance");
                        if (lVarQ2.i()) {
                            Set<String> setP2 = lVarQ2.b().p();
                            p013kotlin.jvm.internal.s.j(setP2, "keySet(...)");
                            string = p013kotlin.collections.v.y0(setP2, null, null, null, 0, null, null, 63, null);
                        } else {
                            string = lVarQ2.toString();
                            p013kotlin.jvm.internal.s.j(string, "toString(...)");
                        }
                        nVarB.l("balance", string);
                    }
                }
            }
        } else if (lVarC.i()) {
            com.google.gson.n nVarB2 = lVarC.b();
            p013kotlin.jvm.internal.s.j(nVarB2, "getAsJsonObject(...)");
            a(nVarB2, "meta");
            a(nVarB2, "balance");
        }
        String string3 = lVarC.toString();
        p013kotlin.jvm.internal.s.j(string3, "toString(...)");
        return string3;
    }

    public static void a(com.google.gson.n nVar, String str) {
        String string;
        if (nVar.o(str)) {
            com.google.gson.l lVarQ = nVar.q(str);
            if (lVarQ.i()) {
                Set<String> setP = lVarQ.b().p();
                p013kotlin.jvm.internal.s.j(setP, "keySet(...)");
                string = p013kotlin.collections.v.y0(setP, null, null, null, 0, null, null, 63, null);
            } else {
                string = lVarQ.toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
            }
            nVar.l(str, string);
        }
    }
}
