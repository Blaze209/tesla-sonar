package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f43998d = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator<File> f43999e = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jv.g f44000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44001b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44002c = null;

    l(jv.g gVar) {
        this.f44000a = gVar;
    }

    private static void d(jv.g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e11) {
            bv.g.f().l("Failed to persist App Quality Sessions session id.", e11);
        }
    }

    static String e(jv.g gVar, @NonNull String str) {
        List<File> listR = gVar.r(str, f43998d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f43999e)).getName().substring(4);
        }
        bv.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(@NonNull String str) {
        if (Objects.equals(this.f44001b, str)) {
            return this.f44002c;
        }
        return e(this.f44000a, str);
    }

    public synchronized void f(@NonNull String str) {
        if (!Objects.equals(this.f44002c, str)) {
            d(this.f44000a, this.f44001b, str);
            this.f44002c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f44001b, str)) {
            d(this.f44000a, str, this.f44002c);
            this.f44001b = str;
        }
    }
}
