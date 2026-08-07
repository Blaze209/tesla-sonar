package com.stripe.android.model;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/s1;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Automatic", "Skip", "Microdeposits", "Instant", "InstantOrSkip", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum s1 {
    Automatic("automatic"),
    Skip("skip"),
    Microdeposits("microdeposits"),
    Instant("instant"),
    InstantOrSkip("instant_or_skip");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String value;

    s1(String str) {
        this.value = str;
    }

    public static EnumEntries<s1> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
