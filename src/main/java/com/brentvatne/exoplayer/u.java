package com.brentvatne.exoplayer;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.p002activity.ComponentActivity;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "Landroidx/activity/ComponentActivity;", "a", "(Landroid/content/Context;)Landroidx/activity/ComponentActivity;", "react-native-video_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u {
    public static final ComponentActivity a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        throw new IllegalStateException("Picture in picture should be called in the context of an Activity");
    }
}
