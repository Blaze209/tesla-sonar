package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.dylanvann.fastimage.FastImageGlideModule;
import com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FastImageGlideModule f20442a = new FastImageGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dylanvann.fastimage.FastImageGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public Set<Class<?>> a() {
        return Collections.EMPTY_SET;
    }

    @Override // sj.a
    public void applyOptions(@NonNull Context context, @NonNull d dVar) {
        this.f20442a.applyOptions(context, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a();
    }

    @Override // sj.a
    public boolean isManifestParsingEnabled() {
        return this.f20442a.isManifestParsingEnabled();
    }

    @Override // sj.c
    public void registerComponents(@NonNull Context context, @NonNull c cVar, @NonNull Registry registry) {
        new com.bumptech.glide.integration.okhttp3.a().registerComponents(context, cVar, registry);
        new FastImageOkHttpProgressGlideModule().registerComponents(context, cVar, registry);
        this.f20442a.registerComponents(context, cVar, registry);
    }
}
