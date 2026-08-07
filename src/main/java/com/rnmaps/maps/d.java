package com.rnmaps.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f49132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f49133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Resources f49134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pl.b<?> f49135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.datasource.c<tk.a<um.e>> f49136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final il.d<um.m> f49137f = new a();

    class a extends il.c<um.m> {
        a() {
        }

        @Override // il.c, il.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void p(String str, um.m mVar, Animatable animatable) throws Throwable {
            tk.a aVar;
            Throwable th2;
            Bitmap bitmapT3;
            try {
                aVar = (tk.a) d.this.f49136e.getResult();
                if (aVar != null) {
                    try {
                        um.e eVar = (um.e) aVar.H();
                        if ((eVar instanceof um.f) && (bitmapT3 = ((um.f) eVar).t3()) != null) {
                            Bitmap bitmapCopy = bitmapT3.copy(Bitmap.Config.ARGB_8888, true);
                            d.this.f49132a.setIconBitmap(bitmapCopy);
                            d.this.f49132a.setIconBitmapDescriptor(BitmapDescriptorFactory.fromBitmap(bitmapCopy));
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        d.this.f49136e.close();
                        if (aVar != null) {
                            tk.a.C(aVar);
                        }
                        throw th2;
                    }
                }
                d.this.f49136e.close();
                if (aVar != null) {
                    tk.a.C(aVar);
                }
                d.this.f49132a.f();
            } catch (Throwable th4) {
                aVar = null;
                th2 = th4;
            }
        }
    }

    public d(Context context, Resources resources, c cVar) {
        this.f49133b = context;
        this.f49134c = resources;
        this.f49132a = cVar;
        pl.b<?> bVarC = pl.b.c(c(resources), context);
        this.f49135d = bVarC;
        bVarC.i();
    }

    private ml.a c(Resources resources) {
        return new ml.b(resources).v(ll.s.f90217e).y(0).a();
    }

    private BitmapDescriptor d(String str) {
        return BitmapDescriptorFactory.fromResource(e(str));
    }

    private int e(String str) {
        return this.f49134c.getIdentifier(str, "drawable", this.f49133b.getPackageName());
    }

    public void f(String str) {
        if (str == null) {
            this.f49132a.setIconBitmapDescriptor(null);
            this.f49132a.f();
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.startsWith("asset://") || str.startsWith("data:")) {
            com.facebook.imagepipeline.request.a aVarA = ImageRequestBuilder.x(Uri.parse(str)).a();
            this.f49136e = el.d.a().k(aVarA, this);
            this.f49135d.n(el.d.f().D(aVarA).C(this.f49137f).a(this.f49135d.e()).build());
            return;
        }
        this.f49132a.setIconBitmapDescriptor(d(str));
        this.f49132a.setIconBitmap(BitmapFactory.decodeResource(this.f49134c, e(str)));
        this.f49132a.f();
    }
}
