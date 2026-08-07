package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
final class a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f44236d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44239c;

    private a1(String str, String str2) {
        this.f44237a = d(str2, str);
        this.f44238b = str;
        this.f44239c = str + "!" + str2;
    }

    static a1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new a1(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f44236d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f44238b;
    }

    public String c() {
        return this.f44237a;
    }

    public String e() {
        return this.f44239c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f44237a.equals(a1Var.f44237a) && this.f44238b.equals(a1Var.f44238b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f44238b, this.f44237a);
    }
}
