package dz;

import android.media.Image;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u0010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ldz/c0;", "Ljava/io/Closeable;", "Landroidx/camera/core/f$a;", "Ldz/a$c;", "configuration", "Ldz/j$b;", "callback", "<init>", "(Ldz/a$c;Ldz/j$b;)V", "Landroidx/camera/core/n;", "imageProxy", "Ljn0/h0;", "analyze", "(Landroidx/camera/core/n;)V", "close", "()V", "a", "Ldz/a$c;", "getConfiguration", "()Ldz/a$c;", "b", "Ldz/j$b;", "getCallback", "()Ldz/j$b;", "Lsx/a;", "c", "Lsx/a;", AnalyticsContext.Scanner, DateTokenConverter.CONVERTER_KEY, "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements Closeable, androidx.camera.core.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CameraConfiguration.CodeScanner configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j.b callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sx.a scanner;

    public c0(CameraConfiguration.CodeScanner configuration, j.b callback) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.configuration = configuration;
        this.callback = callback;
        List<fz.d> listA = configuration.a();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((fz.d) it.next()).toBarcodeType()));
        }
        sx.b.a aVar = new sx.b.a();
        int iIntValue = ((Number) arrayList.get(0)).intValue();
        int[] iArrL1 = p013kotlin.collections.v.l1(arrayList);
        sx.b bVarA = aVar.b(iIntValue, Arrays.copyOf(iArrL1, iArrL1.length)).a();
        p013kotlin.jvm.internal.s.j(bVarA, "build(...)");
        this.scanner = sx.c.b(bVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(wn0.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(c0 c0Var, Exception error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        Log.e("CodeScannerPipeline", "Failed to process Image!", error);
        c0Var.callback.onError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(androidx.camera.core.n nVar, Task it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        nVar.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t(c0 c0Var, wx.a aVar, List list) {
        p013kotlin.jvm.internal.s.h(list);
        if (!list.isEmpty()) {
            c0Var.callback.r(list, new CodeScannerFrame(aVar.m(), aVar.i()));
        }
        return jn0.h0.f84049a;
    }

    @Override // androidx.camera.core.f.a
    public void analyze(final androidx.camera.core.n imageProxy) throws t0 {
        p013kotlin.jvm.internal.s.k(imageProxy, "imageProxy");
        Image image = imageProxy.getImage();
        if (image == null) {
            throw new t0();
        }
        try {
            final wx.a aVarC = wx.a.c(image, imageProxy.z().d());
            p013kotlin.jvm.internal.s.j(aVarC, "fromMediaImage(...)");
            Task<List<tx.a>> taskProcess = this.scanner.process(aVarC);
            final wn0.l lVar = new wn0.l() { // from class: dz.y
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return c0.t(this.f61248a, aVarC, (List) obj);
                }
            };
            taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: dz.z
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    c0.B(lVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: dz.a0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    c0.C(this.f61114a, exc);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: dz.b0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c0.H(imageProxy, task);
                }
            });
        } catch (Throwable th2) {
            Log.e("CodeScannerPipeline", "Failed to process Image!", th2);
            imageProxy.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.scanner.close();
    }
}
