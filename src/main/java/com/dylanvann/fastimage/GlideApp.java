package com.dylanvann.fastimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import com.bumptech.glide.d;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class GlideApp {
    private GlideApp() {
    }

    @SuppressLint({"VisibleForTests"})
    public static void enableHardwareBitmaps() {
        com.bumptech.glide.c.d();
    }

    @NonNull
    public static com.bumptech.glide.c get(@NonNull Context context) {
        return com.bumptech.glide.c.e(context);
    }

    public static File getPhotoCacheDir(@NonNull Context context) {
        return com.bumptech.glide.c.l(context);
    }

    @SuppressLint({"VisibleForTests"})
    @Deprecated
    public static void init(com.bumptech.glide.c cVar) {
        com.bumptech.glide.c.r(cVar);
    }

    @SuppressLint({"VisibleForTests"})
    public static void tearDown() {
        com.bumptech.glide.c.w();
    }

    @NonNull
    public static GlideRequests with(@NonNull Context context) {
        return (GlideRequests) com.bumptech.glide.c.C(context);
    }

    public static File getPhotoCacheDir(@NonNull Context context, @NonNull String str) {
        return com.bumptech.glide.c.m(context, str);
    }

    @SuppressLint({"VisibleForTests"})
    public static void init(@NonNull Context context, @NonNull d dVar) {
        com.bumptech.glide.c.q(context, dVar);
    }

    @NonNull
    public static GlideRequests with(@NonNull Activity activity) {
        return (GlideRequests) com.bumptech.glide.c.A(activity);
    }

    @NonNull
    public static GlideRequests with(@NonNull u uVar) {
        return (GlideRequests) com.bumptech.glide.c.F(uVar);
    }

    @NonNull
    public static GlideRequests with(@NonNull Fragment fragment) {
        return (GlideRequests) com.bumptech.glide.c.E(fragment);
    }

    @NonNull
    @Deprecated
    public static GlideRequests with(@NonNull android.app.Fragment fragment) {
        return (GlideRequests) com.bumptech.glide.c.B(fragment);
    }

    @NonNull
    public static GlideRequests with(@NonNull View view) {
        return (GlideRequests) com.bumptech.glide.c.D(view);
    }
}
