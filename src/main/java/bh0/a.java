package bh0;

import android.os.Parcel;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import cj0.UiStepData;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg0.DocumentStepData;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import pg0.Frame;
import pg0.GovernmentIdDetails;
import vh0.SelfieStepData;
import zi0.CollectedData;
import zi0.CollectedGovernmentIdDetails;
import zi0.DocumentFile;
import zi0.GovernmentIdCapture;
import zi0.SelfieCapture;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "Lai0/f;", "Lzi0/a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Lzi0/a;", "Lzi0/g;", "h", "(Lai0/f;)Lzi0/g;", "Lkg0/c;", "e", "(Lkg0/c;)Lzi0/g;", "Lwg0/d;", "f", "(Lwg0/d;)Lzi0/g;", "Lpg0/k0;", "Lzi0/b;", "a", "(Ljava/util/List;)Lzi0/b;", "Lpg0/d0;", "Lzi0/e;", "b", "(Lpg0/d0;)Lzi0/e;", "Lvh0/b;", "g", "(Lvh0/b;)Lzi0/g;", "Lth0/a1;", "Lzi0/f;", "c", "(Lth0/a1;)Lzi0/f;", "Lcj0/c;", IntegerTokenConverter.CONVERTER_KEY, "(Lcj0/c;)Lzi0/g;", "inquiry-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: bh0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C0344a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f17178c;

        static {
            int[] iArr = new int[pg0.d0.d.values().length];
            try {
                iArr[pg0.d0.d.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pg0.d0.d.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pg0.d0.d.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17176a = iArr;
            int[] iArr2 = new int[pg0.d0.a.values().length];
            try {
                iArr2[pg0.d0.a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pg0.d0.a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pg0.d0.a.UPLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f17177b = iArr2;
            int[] iArr3 = new int[th0.a1.a.values().length];
            try {
                iArr3[th0.a1.a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[th0.a1.a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f17178c = iArr3;
        }
    }

    private static final CollectedGovernmentIdDetails a(List<GovernmentIdDetails> list) {
        Iterator<GovernmentIdDetails> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new CollectedGovernmentIdDetails(null, null);
            }
            GovernmentIdDetails next = it.next();
            if ((next != null ? next.getDateOfBirth() : null) != null && next.getExpirationDate() != null) {
                return new CollectedGovernmentIdDetails(next.getDateOfBirth(), next.getExpirationDate());
            }
        }
    }

    private static final GovernmentIdCapture b(pg0.d0 d0Var) {
        GovernmentIdCapture.d dVar;
        GovernmentIdCapture.a aVar;
        String idClassKey = d0Var.getIdClassKey();
        int i11 = C0344a.f17176a[d0Var.getSide().ordinal()];
        if (i11 == 1) {
            dVar = GovernmentIdCapture.d.Front;
        } else if (i11 == 2) {
            dVar = GovernmentIdCapture.d.Back;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = GovernmentIdCapture.d.FrontAndBack;
        }
        int i12 = C0344a.f17177b[d0Var.getCaptureMethod().ordinal()];
        if (i12 == 1) {
            aVar = GovernmentIdCapture.a.Auto;
        } else if (i12 == 2) {
            aVar = GovernmentIdCapture.a.Manual;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = GovernmentIdCapture.a.Upload;
        }
        List<Frame> listG3 = d0Var.G3();
        ArrayList arrayList = new ArrayList();
        for (Frame frame : listG3) {
            File file = new File(frame.getAbsoluteFilePath());
            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.getMimeType()) : null;
            if (frame2 != null) {
                arrayList.add(frame2);
            }
        }
        return new GovernmentIdCapture(idClassKey, dVar, aVar, arrayList);
    }

    private static final SelfieCapture c(th0.a1 a1Var) {
        SelfieCapture.a aVar;
        if (!new File(a1Var.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int i11 = C0344a.f17178c[a1Var.getCaptureMethod().ordinal()];
        if (i11 == 1) {
            aVar = SelfieCapture.a.Auto;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = SelfieCapture.a.Manual;
        }
        return new SelfieCapture(aVar, new File(a1Var.getAbsoluteFilePath()));
    }

    public static final CollectedData d(List<? extends ai0.f> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            zi0.g gVarH = h((ai0.f) it.next());
            if (gVarH != null) {
                arrayList.add(gVarH);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CollectedData(arrayList);
    }

    private static final zi0.g e(DocumentStepData documentStepData) {
        DocumentFile documentFile;
        String stepName = documentStepData.getStepName();
        List<ig0.d> listA = documentStepData.a();
        ArrayList arrayList = new ArrayList();
        for (ig0.d dVar : listA) {
            if (dVar instanceof ig0.d.Local) {
                documentFile = new DocumentFile(new File(((ig0.d.Local) dVar).getAbsoluteFilePath()));
            } else {
                if (!(dVar instanceof ig0.d.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                String absoluteFilePath = ((ig0.d.Remote) dVar).getAbsoluteFilePath();
                documentFile = absoluteFilePath != null ? new DocumentFile(new File(absoluteFilePath)) : null;
            }
            if (documentFile != null) {
                arrayList.add(documentFile);
            }
        }
        return new zi0.g.DocumentStepData(stepName, arrayList);
    }

    private static final zi0.g f(wg0.d dVar) {
        String stepName = dVar.getStepName();
        List<pg0.d0> listA = dVar.a();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((pg0.d0) it.next()));
        }
        List<pg0.d0> listA2 = dVar.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA2) {
            if (obj instanceof pg0.d0.GovernmentIdImage) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((pg0.d0.GovernmentIdImage) it2.next()).getIdDetails());
        }
        return new zi0.g.GovernmentIdStepData(stepName, arrayList, a(arrayList3));
    }

    private static final zi0.g g(SelfieStepData selfieStepData) {
        String stepName = selfieStepData.getStepName();
        th0.a1 centerCapture = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureC = centerCapture != null ? c(centerCapture) : null;
        th0.a1 centerCapture2 = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureC2 = centerCapture2 != null ? c(centerCapture2) : null;
        th0.a1 centerCapture3 = selfieStepData.getCenterCapture();
        return new zi0.g.SelfieStepData(stepName, selfieCaptureC, selfieCaptureC2, centerCapture3 != null ? c(centerCapture3) : null);
    }

    public static final zi0.g h(ai0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        if (fVar instanceof UiStepData) {
            return i((UiStepData) fVar);
        }
        if (fVar instanceof SelfieStepData) {
            return g((SelfieStepData) fVar);
        }
        if (fVar instanceof wg0.d) {
            return f((wg0.d) fVar);
        }
        if (fVar instanceof DocumentStepData) {
            return e((DocumentStepData) fVar);
        }
        return null;
    }

    public static final zi0.g i(UiStepData uiStepData) {
        p013kotlin.jvm.internal.s.k(uiStepData, "<this>");
        Parcel parcelObtain = Parcel.obtain();
        p013kotlin.jvm.internal.s.j(parcelObtain, "obtain(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = uiStepData.a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            try {
                Object objA = com.withpersona.sdk2.inquiry.ui.network.a.a((ComponentParam) entry.getValue());
                parcelObtain.writeValue(objA);
                linkedHashMap.put(str, objA);
            } catch (RuntimeException unused) {
            }
        }
        parcelObtain.recycle();
        return new zi0.g.UiStepData(uiStepData.getStepName(), linkedHashMap);
    }
}
