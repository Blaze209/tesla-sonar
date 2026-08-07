package com.tesla.domain.model.adapter;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tesla/domain/model/adapter/ForceToIntAdapter;", "", "<init>", "()V", "", IntegerTokenConverter.CONVERTER_KEY, "toJson", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Ljava/lang/Integer;", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ForceToIntAdapter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56220a;

        static {
            int[] iArr = new int[k.c.values().length];
            try {
                iArr[k.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.c.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56220a = iArr;
        }
    }

    @f
    @ForceToInt
    public final Integer fromJson(k reader) {
        s.k(reader, "reader");
        k.c cVarB = reader.B();
        int i11 = cVarB == null ? -1 : a.f56220a[cVarB.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(reader.nextInt());
        }
        if (i11 == 2) {
            return Integer.valueOf(reader.nextBoolean() ? 1 : 0);
        }
        reader.F();
        return null;
    }

    @x
    public final Integer toJson(@ForceToInt Integer i11) {
        return i11;
    }
}
