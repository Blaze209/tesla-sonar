package jj;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class y<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f83913b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Action.FILE_ATTRIBUTE, "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<Data> f83914a;

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public y(c<Data> cVar) {
        this.f83914a = cVar;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(uri), this.f83914a.a(uri));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return f83913b.contains(uri.getScheme());
    }

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f83915a;

        public a(ContentResolver contentResolver) {
            this.f83915a = contentResolver;
        }

        @Override // jj.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f83915a, uri);
        }

        @Override // jj.p
        public o<Uri, AssetFileDescriptor> e(s sVar) {
            return new y(this);
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f83916a;

        public b(ContentResolver contentResolver) {
            this.f83916a = contentResolver;
        }

        @Override // jj.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f83916a, uri);
        }

        @Override // jj.p
        @NonNull
        public o<Uri, ParcelFileDescriptor> e(s sVar) {
            return new y(this);
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f83917a;

        public d(ContentResolver contentResolver) {
            this.f83917a = contentResolver;
        }

        @Override // jj.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f83917a, uri);
        }

        @Override // jj.p
        @NonNull
        public o<Uri, InputStream> e(s sVar) {
            return new y(this);
        }

        @Override // jj.p
        public void d() {
        }
    }
}
