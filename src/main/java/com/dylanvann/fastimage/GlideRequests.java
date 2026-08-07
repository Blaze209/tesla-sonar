package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.l;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.i;
import java.io.File;
import java.net.URL;
import rj.j;
import rj.p;

/* JADX INFO: loaded from: classes3.dex */
public class GlideRequests extends l {
    public GlideRequests(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull p pVar, @NonNull Context context) {
        super(cVar, jVar, pVar, context);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public /* bridge */ /* synthetic */ l addDefaultRequestListener(h hVar) {
        return addDefaultRequestListener((h<Object>) hVar);
    }

    @Override // com.bumptech.glide.l
    protected void setRequestOptions(@NonNull i iVar) {
        if (iVar instanceof GlideOptions) {
            super.setRequestOptions(iVar);
        } else {
            super.setRequestOptions(new GlideOptions().apply((com.bumptech.glide.request.a<?>) iVar));
        }
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequests addDefaultRequestListener(h<Object> hVar) {
        return (GlideRequests) super.addDefaultRequestListener(hVar);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public synchronized GlideRequests applyDefaultRequestOptions(@NonNull i iVar) {
        return (GlideRequests) super.applyDefaultRequestOptions(iVar);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public <ResourceType> GlideRequest<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequest<File> asFile() {
        return (GlideRequest) super.asFile();
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequest<pj.c> asGif() {
        return (GlideRequest) super.asGif();
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequest<File> download(Object obj) {
        return (GlideRequest) super.download(obj);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    @Override // com.bumptech.glide.l
    @NonNull
    public synchronized GlideRequests setDefaultRequestOptions(@NonNull i iVar) {
        return (GlideRequests) super.setDefaultRequestOptions(iVar);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo73load(Bitmap bitmap) {
        return (GlideRequest) super.mo73load(bitmap);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo74load(Drawable drawable) {
        return (GlideRequest) super.mo74load(drawable);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo79load(String str) {
        return (GlideRequest) super.mo79load(str);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo75load(Uri uri) {
        return (GlideRequest) super.mo75load(uri);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo76load(File file) {
        return (GlideRequest) super.mo76load(file);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo77load(Integer num) {
        return (GlideRequest) super.mo77load(num);
    }

    @Override // com.bumptech.glide.l
    @Deprecated
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo80load(URL url) {
        return (GlideRequest) super.mo80load(url);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo81load(byte[] bArr) {
        return (GlideRequest) super.mo81load(bArr);
    }

    @Override // com.bumptech.glide.l
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<Drawable> mo78load(Object obj) {
        return (GlideRequest) super.mo78load(obj);
    }
}
