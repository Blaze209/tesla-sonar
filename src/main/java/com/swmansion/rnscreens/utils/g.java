package com.swmansion.rnscreens.utils;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/utils/g;", "", "<init>", "()V", "", "tag", "message", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "", "args", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {
    public static final g INSTANCE = new g();

    private g() {
    }

    public final void d(String tag, String message) {
        s.k(tag, "tag");
        s.k(message, "message");
    }

    public final void d(String tag, String message, Object... args) {
        s.k(tag, "tag");
        s.k(message, "message");
        s.k(args, "args");
    }
}
