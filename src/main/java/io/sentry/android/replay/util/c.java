package io.sentry.android.replay.util;

import android.content.Context;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/Context;", "a", "(Landroid/content/Context;)Landroid/content/Context;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final Context a(Context context) {
        s.k(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
