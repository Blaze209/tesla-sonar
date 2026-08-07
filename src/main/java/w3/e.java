package w3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import java.util.List;
import p013kotlin.Metadata;
import v3.HistoricalChange;
import v3.PointerInputChange;
import v3.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!\"0\u0010*\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"0\u0010/\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010#\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'*\u0018\b\u0002\u00100\"\b\u0012\u0004\u0012\u00020\u00120\u00002\b\u0012\u0004\u0012\u00020\u00120\u0000*\f\b\u0002\u00101\"\u00020\u00122\u00020\u0012¨\u00062"}, d2 = {"", "Lw3/a;", "", "index", "", "time", "", "dataPoint", "Ljn0/h0;", "j", "([Lw3/a;IJF)V", "Lw3/d;", "Lv3/x;", "event", "c", "(Lw3/d;Lv3/x;)V", DateTokenConverter.CONVERTER_KEY, "e", "", "x", "y", "sampleCount", "degree", "coefficients", IntegerTokenConverter.CONVERTER_KEY, "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "f", "([F[FIZ)F", "a", "g", "([F[F)F", "<set-?>", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "b", "h", "setVelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "VelocityTrackerStrategyUseImpulse", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f120543a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f120544b;

    public static final void c(d dVar, PointerInputChange pointerInputChange) {
        if (f120543a) {
            e(dVar, pointerInputChange);
        } else {
            d(dVar, pointerInputChange);
        }
    }

    private static final void d(d dVar, PointerInputChange pointerInputChange) {
        if (n.b(pointerInputChange)) {
            dVar.f(pointerInputChange.getPosition());
            dVar.e();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> listE = pointerInputChange.e();
        int size = listE.size();
        int i11 = 0;
        while (i11 < size) {
            HistoricalChange historicalChange = listE.get(i11);
            long jQ = g.q(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            dVar.f(g.r(dVar.getCurrentPointerPositionAccumulator(), jQ));
            dVar.a(historicalChange.getUptimeMillis(), dVar.getCurrentPointerPositionAccumulator());
            i11++;
            previousPosition = position;
        }
        dVar.f(g.r(dVar.getCurrentPointerPositionAccumulator(), g.q(pointerInputChange.getPosition(), previousPosition)));
        dVar.a(pointerInputChange.getUptimeMillis(), dVar.getCurrentPointerPositionAccumulator());
    }

    private static final void e(d dVar, PointerInputChange pointerInputChange) {
        if (n.b(pointerInputChange)) {
            dVar.e();
        }
        if (!n.d(pointerInputChange)) {
            List<HistoricalChange> listE = pointerInputChange.e();
            int size = listE.size();
            for (int i11 = 0; i11 < size; i11++) {
                HistoricalChange historicalChange = listE.get(i11);
                dVar.a(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            dVar.a(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (n.d(pointerInputChange) && pointerInputChange.getUptimeMillis() - dVar.getLastMoveEventTimeStamp() > 40) {
            dVar.e();
        }
        dVar.g(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i11, boolean z11) {
        int i12 = i11 - 1;
        float f11 = fArr2[i12];
        float fSignum = BitmapDescriptorFactory.HUE_RED;
        int i13 = i12;
        while (i13 > 0) {
            int i14 = i13 - 1;
            float f12 = fArr2[i14];
            if (f11 != f12) {
                float f13 = (z11 ? -fArr[i14] : fArr[i13] - fArr[i14]) / (f11 - f12);
                fSignum += (f13 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f13);
                if (i13 == i12) {
                    fSignum *= 0.5f;
                }
            }
            i13--;
            f11 = f12;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < length; i11++) {
            f11 += fArr[i11] * fArr2[i11];
        }
        return f11;
    }

    public static final boolean h() {
        return f120544b;
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i11, int i12, float[] fArr3) {
        int i13 = i12;
        if (i13 < 1) {
            y3.a.a("The degree must be at positive integer");
        }
        if (i11 == 0) {
            y3.a.a("At least one point must be provided");
        }
        if (i13 >= i11) {
            i13 = i11 - 1;
        }
        int i14 = i13 + 1;
        float[][] fArr4 = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr4[i15] = new float[i11];
        }
        for (int i16 = 0; i16 < i11; i16++) {
            fArr4[0][i16] = 1.0f;
            for (int i17 = 1; i17 < i14; i17++) {
                fArr4[i17][i16] = fArr4[i17 - 1][i16] * fArr[i16];
            }
        }
        float[][] fArr5 = new float[i14][];
        for (int i18 = 0; i18 < i14; i18++) {
            fArr5[i18] = new float[i11];
        }
        float[][] fArr6 = new float[i14][];
        for (int i19 = 0; i19 < i14; i19++) {
            fArr6[i19] = new float[i14];
        }
        int i21 = 0;
        while (i21 < i14) {
            float[] fArr7 = fArr5[i21];
            p013kotlin.collections.n.m(fArr4[i21], fArr7, 0, 0, i11);
            for (int i22 = 0; i22 < i21; i22++) {
                float[] fArr8 = fArr5[i22];
                float fG = g(fArr7, fArr8);
                for (int i23 = 0; i23 < i11; i23++) {
                    fArr7[i23] = fArr7[i23] - (fArr8[i23] * fG);
                }
            }
            float fSqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f11 = 1.0f / fSqrt;
            for (int i24 = 0; i24 < i11; i24++) {
                fArr7[i24] = fArr7[i24] * f11;
            }
            float[] fArr9 = fArr6[i21];
            int i25 = 0;
            while (i25 < i14) {
                fArr9[i25] = i25 < i21 ? BitmapDescriptorFactory.HUE_RED : g(fArr7, fArr4[i25]);
                i25++;
            }
            i21++;
        }
        for (int i26 = i13; -1 < i26; i26--) {
            float fG2 = g(fArr5[i26], fArr2);
            float[] fArr10 = fArr6[i26];
            int i27 = i26 + 1;
            if (i27 <= i13) {
                int i28 = i13;
                while (true) {
                    fG2 -= fArr10[i28] * fArr3[i28];
                    if (i28 != i27) {
                        i28--;
                    }
                }
            }
            fArr3[i26] = fG2 / fArr10[i26];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DataPointAtTime[] dataPointAtTimeArr, int i11, long j11, float f11) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i11];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i11] = new DataPointAtTime(j11, f11);
        } else {
            dataPointAtTime.d(j11);
            dataPointAtTime.c(f11);
        }
    }
}
