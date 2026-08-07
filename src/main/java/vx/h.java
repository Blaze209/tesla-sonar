package vx;

import android.graphics.Point;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends xx.e implements sx.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final sx.b f120077m = new sx.b.a().a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f120078n = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f120079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sx.b f120080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final zzxk f120081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f120082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f120083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(@NonNull sx.b bVar, @NonNull l lVar, @NonNull Executor executor, @NonNull zzwp zzwpVar, @NonNull com.google.mlkit.common.sdkinternal.i iVar) {
        super(lVar, executor);
        bVar.b();
        this.f120080i = bVar;
        boolean zF = b.f();
        this.f120079h = zF;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(b.c(bVar));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zF ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.f120081j = null;
    }

    private final Task C(@NonNull Task task, final int i11, final int i12) {
        return task.onSuccessTask(new SuccessContinuation() { // from class: vx.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f120071a.t(i11, i12, (List) obj);
            }
        });
    }

    @Override // xx.e, java.io.Closeable, java.lang.AutoCloseable, sx.a
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.f120081j;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.f120083l);
                this.f120081j.zzj();
            }
            super.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // cy.a
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f120079h ? com.google.mlkit.common.sdkinternal.m.f45053a : new Feature[]{com.google.mlkit.common.sdkinternal.m.f45054b};
    }

    @Override // sx.a
    @NonNull
    public final Task<List<tx.a>> process(@NonNull wx.a aVar) {
        return C(super.n(aVar), aVar.m(), aVar.i());
    }

    final /* synthetic */ Task t(int i11, int i12, List list) {
        if (this.f120081j == null) {
            return Tasks.forResult(list);
        }
        this.f120082k++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tx.a aVar = (tx.a) it.next();
            if (aVar.c() == -1) {
                arrayList2.add(aVar);
            } else {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                Point[] pointArrB = ((tx.a) arrayList2.get(i13)).b();
                if (pointArrB != null) {
                    this.f120081j.zzi(this.f120082k, zzxn.zzg(Arrays.asList(pointArrB), i11, i12, BitmapDescriptorFactory.HUE_RED));
                }
            }
        } else {
            this.f120083l = true;
        }
        if (true != this.f120080i.d()) {
            list = arrayList;
        }
        return Tasks.forResult(list);
    }
}
