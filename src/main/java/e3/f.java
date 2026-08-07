package e3;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le3/c;", "Landroid/view/ViewStructure;", "root", "Ljn0/h0;", "b", "(Le3/c;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(Le3/c;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final void a(c cVar, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            AutofillValue autofillValueA = e.a(sparseArray.get(iKeyAt));
            i iVar = i.f61589a;
            if (iVar.d(autofillValueA)) {
                cVar.getAutofillTree().b(iKeyAt, iVar.i(autofillValueA).toString());
            } else {
                if (iVar.b(autofillValueA)) {
                    throw new q("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (iVar.c(autofillValueA)) {
                    throw new q("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (iVar.e(autofillValueA)) {
                    throw new q("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(c cVar, ViewStructure viewStructure) {
        int iA = h.f61588a.a(viewStructure, cVar.getAutofillTree().a().size());
        for (Map.Entry<Integer, k> entry : cVar.getAutofillTree().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            k value = entry.getValue();
            h hVar = h.f61588a;
            ViewStructure viewStructureB = hVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                i iVar = i.f61589a;
                AutofillId autofillIdA = iVar.a(viewStructure);
                s.h(autofillIdA);
                iVar.g(viewStructureB, autofillIdA, iIntValue);
                hVar.d(viewStructureB, iIntValue, cVar.getView().getContext().getPackageName(), null, null);
                iVar.h(viewStructureB, n.INSTANCE.a());
                List<m> listC = value.c();
                ArrayList arrayList = new ArrayList(listC.size());
                int size = listC.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(d.a(listC.get(i11)));
                }
                iVar.f(viewStructureB, (String[]) arrayList.toArray(new String[0]));
                j3.i boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iRound = Math.round(boundingBox.getLeft());
                    int iRound2 = Math.round(boundingBox.getTop());
                    int iRound3 = Math.round(boundingBox.getRight());
                    h.f61588a.c(viewStructureB, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
                }
            }
            iA++;
        }
    }
}
