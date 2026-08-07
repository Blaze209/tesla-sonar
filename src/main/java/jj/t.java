package jj;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class t<Data> implements o<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f83899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f83900b;

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f83900b = resources;
        this.f83899a = oVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f83900b.getResourcePackageName(num.intValue()) + '/' + this.f83900b.getResourceTypeName(num.intValue()) + '/' + this.f83900b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e11) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e11);
            return null;
        }
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull Integer num, int i11, int i12, @NonNull dj.h hVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f83899a.b(uriD, i11, i12, hVar);
    }

    @Override // jj.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Integer num) {
        return true;
    }

    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f83901a;

        public a(Resources resources) {
            this.f83901a = resources;
        }

        @Override // jj.p
        public o<Integer, AssetFileDescriptor> e(s sVar) {
            return new t(this.f83901a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class b implements p<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f83902a;

        public b(Resources resources) {
            this.f83902a = resources;
        }

        @Override // jj.p
        @NonNull
        public o<Integer, InputStream> e(s sVar) {
            return new t(this.f83902a, sVar.d(Uri.class, InputStream.class));
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class c implements p<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f83903a;

        public c(Resources resources) {
            this.f83903a = resources;
        }

        @Override // jj.p
        @NonNull
        public o<Integer, Uri> e(s sVar) {
            return new t(this.f83903a, x.c());
        }

        @Override // jj.p
        public void d() {
        }
    }
}
