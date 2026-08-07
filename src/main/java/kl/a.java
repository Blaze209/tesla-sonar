package kl;

import android.graphics.drawable.Animatable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import il.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lkl/a;", "Lil/c;", "", "Lkl/b;", "imageLoadingTimeListener", "<init>", "(Lkl/b;)V", "", "id", "callerContext", "Ljn0/h0;", "l", "(Ljava/lang/String;Ljava/lang/Object;)V", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "p", "(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V", "b", "Lkl/b;", "", "c", "J", "requestSubmitTimeMs", DateTokenConverter.CONVERTER_KEY, "finalImageSetTimeMs", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b imageLoadingTimeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long requestSubmitTimeMs = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long finalImageSetTimeMs = -1;

    public a(b bVar) {
        this.imageLoadingTimeListener = bVar;
    }

    @Override // il.c, il.d
    public void l(String id2, Object callerContext) {
        s.k(id2, "id");
        this.requestSubmitTimeMs = System.currentTimeMillis();
    }

    @Override // il.c, il.d
    public void p(String id2, Object imageInfo, Animatable animatable) {
        s.k(id2, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.finalImageSetTimeMs = jCurrentTimeMillis;
        b bVar = this.imageLoadingTimeListener;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.requestSubmitTimeMs);
        }
    }
}
