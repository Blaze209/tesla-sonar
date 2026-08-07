package com.fourthline.core;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"toFourthlineValue", "", "Lcom/fourthline/core/DocumentFileSide;", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DocumentFileSideKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toFourthlineValue(DocumentFileSide documentFileSide) {
        s.k(documentFileSide, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[documentFileSide.ordinal()];
        if (i11 == 1) {
            return "Front";
        }
        if (i11 == 2) {
            return "Back";
        }
        if (i11 == 3) {
            return "InsideLeft";
        }
        if (i11 == 4) {
            return "InsideRight";
        }
        throw new NoWhenBranchMatchedException();
    }
}
