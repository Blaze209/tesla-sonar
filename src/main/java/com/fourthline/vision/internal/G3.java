package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.MrzValidationPolicy;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class G3 implements wn0.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f37716e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37717f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f37718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimestampProvider f37719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f37720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T0.b f37721d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MrzValidationPolicy.values().length];
            try {
                iArr[MrzValidationPolicy.STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MrzValidationPolicy.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MrzValidationPolicy.WEAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public G3(wn0.a<? extends MrzValidationPolicy> mrzValidationPolicyFactory, TimestampProvider timestampProvider) {
        p013kotlin.jvm.internal.s.k(mrzValidationPolicyFactory, "mrzValidationPolicyFactory");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        this.f37718a = mrzValidationPolicyFactory;
        this.f37719b = timestampProvider;
    }

    private final List<T0.b> candidateMrzDetectionOrEmpty() {
        T0.b bVar = this.f37721d;
        if (bVar != null) {
            cleanUpCandidate();
            List<T0.b> listE = p013kotlin.collections.v.e(bVar);
            if (listE != null) {
                return listE;
            }
        }
        return p013kotlin.collections.v.m();
    }

    private final void cleanUpCandidate() {
        this.f37720c = null;
        this.f37721d = null;
    }

    private final boolean doesPassPolicy(MrzInfo mrzInfo) {
        int i11 = b.$EnumSwitchMapping$0[getMrzValidationPolicy().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (errorsCount(mrzInfo) >= 4) {
                    return false;
                }
            } else if (errorsCount(mrzInfo) >= 2) {
                return false;
            }
        } else if (errorsCount(mrzInfo) != 0) {
            return false;
        }
        return true;
    }

    private final int errorsCount(MrzInfo mrzInfo) {
        List<ValidationError> validationErrors = mrzInfo.getValidationErrors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : validationErrors) {
            ValidationError validationError = (ValidationError) obj;
            int i11 = b.$EnumSwitchMapping$0[getMrzValidationPolicy().ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (validationError != MrtdMrzInfoValidationError.TRUNCATED_NAMES && validationError != MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM && validationError != IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM) {
                    arrayList.add(obj);
                }
            } else if (validationError != MrtdMrzInfoValidationError.TRUNCATED_NAMES) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    private final MrzValidationPolicy getMrzValidationPolicy() {
        return (MrzValidationPolicy) this.f37718a.invoke();
    }

    private final long getTimeoutThreshold() {
        Long l11 = this.f37720c;
        if (l11 != null) {
            return l11.longValue() + ((long) 500);
        }
        return Long.MAX_VALUE;
    }

    private final boolean isPerfect(MrzInfo mrzInfo) {
        return errorsCount(mrzInfo) == 0;
    }

    private final boolean isTimeout() {
        return this.f37719b.getCurrentTimestamp() >= getTimeoutThreshold();
    }

    private final List<T0> processAsFirstCandidate(T0.b bVar) {
        if (!isPerfect(bVar.getMrz())) {
            return doesPassPolicy(bVar.getMrz()) ? saveCandidate(Long.valueOf(this.f37719b.getCurrentTimestamp()), bVar) : p013kotlin.collections.v.m();
        }
        List<T0> listE = p013kotlin.collections.v.e(bVar);
        cleanUpCandidate();
        return listE;
    }

    private final List<T0> processNewCandidate(T0.b bVar, T0.b bVar2) {
        List<T0.b> listCandidateMrzDetectionOrEmpty;
        if (bVar2 != null) {
            if (isPerfect(bVar2.getMrz())) {
                listCandidateMrzDetectionOrEmpty = p013kotlin.collections.v.e(bVar2);
                cleanUpCandidate();
            } else {
                if (errorsCount(bVar2.getMrz()) < errorsCount(bVar.getMrz())) {
                    saveCandidate(this.f37720c, bVar2);
                }
                listCandidateMrzDetectionOrEmpty = isTimeout() ? candidateMrzDetectionOrEmpty() : p013kotlin.collections.v.m();
            }
            if (listCandidateMrzDetectionOrEmpty != null) {
                return listCandidateMrzDetectionOrEmpty;
            }
        }
        return isTimeout() ? candidateMrzDetectionOrEmpty() : p013kotlin.collections.v.m();
    }

    private final List<T0> saveCandidate(Long l11, T0.b bVar) {
        List<T0> listM = p013kotlin.collections.v.m();
        this.f37720c = l11;
        this.f37721d = bVar;
        return listM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wn0.l
    public List<T0> invoke(List<? extends T0> input) {
        List<T0> listProcessNewCandidate;
        p013kotlin.jvm.internal.s.k(input, "input");
        ArrayList arrayList = new ArrayList();
        for (Object obj : input) {
            if (obj instanceof T0.b) {
                arrayList.add(obj);
            }
        }
        T0.b bVar = (T0.b) p013kotlin.collections.v.q0(arrayList);
        T0.b bVar2 = this.f37721d;
        if (bVar2 == null || (listProcessNewCandidate = processNewCandidate(bVar2, bVar)) == null) {
            return bVar != null ? processAsFirstCandidate(bVar) : input;
        }
        return listProcessNewCandidate;
    }
}
