package jj;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f83814c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f83815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1771a<Data> f83816b;

    /* JADX INFO: renamed from: jj.a$a, reason: collision with other inner class name */
    public interface InterfaceC1771a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, InterfaceC1771a<Data> interfaceC1771a) {
        this.f83815a = assetManager;
        this.f83816b = interfaceC1771a;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(uri), this.f83816b.a(this.f83815a, uri.toString().substring(f83814c)));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return Action.FILE_ATTRIBUTE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC1771a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f83817a;

        public b(AssetManager assetManager) {
            this.f83817a = assetManager;
        }

        @Override // jj.a.InterfaceC1771a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // jj.p
        @NonNull
        public o<Uri, AssetFileDescriptor> e(s sVar) {
            return new a(this.f83817a, this);
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class c implements p<Uri, InputStream>, InterfaceC1771a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f83818a;

        public c(AssetManager assetManager) {
            this.f83818a = assetManager;
        }

        @Override // jj.a.InterfaceC1771a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // jj.p
        @NonNull
        public o<Uri, InputStream> e(s sVar) {
            return new a(this.f83818a, this);
        }

        @Override // jj.p
        public void d() {
        }
    }
}
