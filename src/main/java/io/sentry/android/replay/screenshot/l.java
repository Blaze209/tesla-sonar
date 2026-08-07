package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.WeakHashMap;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\u001fJ+\u0010+\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020\nH\u0017¢\u0006\u0004\b+\u0010,J#\u0010+\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b+\u0010-JA\u0010+\u001a\u00020\n2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020\nH\u0017¢\u0006\u0004\b+\u00102J9\u0010+\u001a\u00020\n2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b+\u00103J)\u00105\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00104\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0017¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00107J?\u00105\u001a\u00020\n2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00104\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0017¢\u0006\u0004\b5\u00108J7\u00105\u001a\u00020\n2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00109J\u000f\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u0017\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010$J\u001f\u0010@\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010AJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bH\u0010AJ\u0019\u0010K\u001a\u00020\u00102\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020\u00102\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010N\u001a\u00020IH\u0017¢\u0006\u0004\bO\u0010LJ\u001f\u0010S\u001a\u00020\u00162\u0006\u0010P\u001a\u00020(2\u0006\u0010R\u001a\u00020QH\u0017¢\u0006\u0004\bS\u0010TJ\u001f\u0010S\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\b2\u0006\u0010R\u001a\u00020QH\u0017¢\u0006\u0004\bS\u0010UJ\u0017\u0010S\u001a\u00020\u00162\u0006\u0010P\u001a\u00020(H\u0016¢\u0006\u0004\bS\u0010VJ\u0017\u0010S\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010WJ7\u0010S\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010R\u001a\u00020QH\u0017¢\u0006\u0004\bS\u0010XJ/\u0010S\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\bS\u0010YJ/\u0010S\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010ZJ\u0017\u0010[\u001a\u00020\u00162\u0006\u0010P\u001a\u00020(H\u0017¢\u0006\u0004\b[\u0010VJ\u0017\u0010[\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\bH\u0017¢\u0006\u0004\b[\u0010WJ/\u0010[\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0017¢\u0006\u0004\b[\u0010YJ/\u0010[\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\nH\u0017¢\u0006\u0004\b[\u0010ZJ\u001f\u0010^\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\\2\u0006\u0010R\u001a\u00020QH\u0017¢\u0006\u0004\b^\u0010_J\u0017\u0010^\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010`J\u0017\u0010a\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\\H\u0017¢\u0006\u0004\ba\u0010`J\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020\u00102\b\u0010e\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\u00162\u0006\u0010P\u001a\u00020(2\u0006\u0010i\u001a\u00020hH\u0017¢\u0006\u0004\bj\u0010kJ\u0017\u0010j\u001a\u00020\u00162\u0006\u0010P\u001a\u00020(H\u0017¢\u0006\u0004\bj\u0010VJ\u001f\u0010j\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\\2\u0006\u0010i\u001a\u00020hH\u0017¢\u0006\u0004\bj\u0010lJ\u0017\u0010j\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\\H\u0017¢\u0006\u0004\bj\u0010`J7\u0010j\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010i\u001a\u00020hH\u0017¢\u0006\u0004\bj\u0010mJ/\u0010j\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0017¢\u0006\u0004\bj\u0010YJ\u0017\u0010n\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\bn\u0010WJ\u0017\u0010q\u001a\u00020\u00102\u0006\u0010p\u001a\u00020oH\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010q\u001a\u00020\u00102\u0006\u0010p\u001a\u00020o2\u0006\u0010s\u001a\u00020(H\u0016¢\u0006\u0004\bq\u0010tJ\u001f\u0010q\u001a\u00020\u00102\u0006\u0010p\u001a\u00020o2\u0006\u0010s\u001a\u00020\bH\u0016¢\u0006\u0004\bq\u0010uJ7\u0010z\u001a\u00020\u00102\u0006\u0010v\u001a\u00020(2\u0006\u0010w\u001a\u00020\r2\u0006\u0010x\u001a\u00020\r2\u0006\u0010y\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bz\u0010{JO\u0010z\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010w\u001a\u00020\r2\u0006\u0010x\u001a\u00020\r2\u0006\u0010y\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bz\u0010|J2\u0010\u0080\u0001\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J4\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J6\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010s\u001a\u00020(2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J6\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010s\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0085\u0001Jc\u0010\u0082\u0001\u001a\u00020\u00102\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u008d\u0001Jc\u0010\u0082\u0001\u001a\u00020\u00102\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u008e\u0001J,\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u008f\u0001J^\u0010\u0096\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0007\u0010\u0090\u0001\u001a\u00020\n2\u0007\u0010\u0091\u0001\u001a\u00020\n2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0094\u0001\u001a\u00020\n2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0007\u0010\u0095\u0001\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J5\u0010\u009b\u0001\u001a\u00020\u00102\u0007\u0010\u0098\u0001\u001a\u00020\r2\u0007\u0010\u0099\u0001\u001a\u00020\r2\u0007\u0010\u009a\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u00102\u0007\u0010\u009d\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u009e\u0001\u0010$J\u001c\u0010\u009e\u0001\u001a\u00020\u00102\b\u0010\u009d\u0001\u001a\u00030\u009f\u0001H\u0017¢\u0006\u0006\b\u009e\u0001\u0010 \u0001J%\u0010\u009e\u0001\u001a\u00020\u00102\u0007\u0010\u009d\u0001\u001a\u00020\n2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010£\u0001J%\u0010\u009e\u0001\u001a\u00020\u00102\u0007\u0010\u009d\u0001\u001a\u00020\n2\b\u0010¢\u0001\u001a\u00030¤\u0001H\u0017¢\u0006\u0006\b\u009e\u0001\u0010¥\u0001J&\u0010\u009e\u0001\u001a\u00020\u00102\b\u0010\u009d\u0001\u001a\u00030\u009f\u00012\b\u0010¢\u0001\u001a\u00030¤\u0001H\u0017¢\u0006\u0006\b\u009e\u0001\u0010¦\u0001J>\u0010«\u0001\u001a\u00020\u00102\u0007\u0010§\u0001\u001a\u00020\r2\u0007\u0010¨\u0001\u001a\u00020\r2\u0007\u0010©\u0001\u001a\u00020\r2\u0007\u0010ª\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J6\u0010¯\u0001\u001a\u00020\u00102\b\u0010\u00ad\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J$\u0010¯\u0001\u001a\u00020\u00102\b\u0010\u00ad\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b¯\u0001\u0010±\u0001J\"\u0010²\u0001\u001a\u00020\u00102\u0006\u0010v\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J:\u0010²\u0001\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b²\u0001\u0010¬\u0001J\u001a\u0010´\u0001\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J.\u0010¸\u0001\u001a\u00020\u00102\b\u0010·\u0001\u001a\u00030¶\u00012\u0006\u0010s\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b¸\u0001\u0010¹\u0001J.\u0010¸\u0001\u001a\u00020\u00102\b\u0010·\u0001\u001a\u00030¶\u00012\u0006\u0010s\u001a\u00020(2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b¸\u0001\u0010º\u0001J\"\u0010»\u0001\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\\2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b»\u0001\u0010¼\u0001J*\u0010½\u0001\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J8\u0010¿\u0001\u001a\u00020\u00102\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u0092\u00012\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b¿\u0001\u0010°\u0001J$\u0010¿\u0001\u001a\u00020\u00102\b\u0010\u00ad\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b¿\u0001\u0010±\u0001J\"\u0010À\u0001\u001a\u00020\u00102\u0006\u0010P\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÀ\u0001\u0010³\u0001J\"\u0010À\u0001\u001a\u00020\u00102\u0006\u0010}\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J:\u0010À\u0001\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÀ\u0001\u0010¬\u0001J*\u0010Â\u0001\u001a\u00020\u00102\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nH\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J4\u0010Æ\u0001\u001a\u00020\u00102\u0006\u0010P\u001a\u00020(2\u0007\u0010Ä\u0001\u001a\u00020\r2\u0007\u0010Å\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001JL\u0010Æ\u0001\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0007\u0010Ä\u0001\u001a\u00020\r2\u0007\u0010Å\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÆ\u0001\u0010È\u0001JP\u0010Ï\u0001\u001a\u00020\u00102\u0007\u0010É\u0001\u001a\u00020(2\u0007\u0010Ê\u0001\u001a\u00020\r2\u0007\u0010Ë\u0001\u001a\u00020\r2\u0007\u0010Ì\u0001\u001a\u00020(2\u0007\u0010Í\u0001\u001a\u00020\r2\u0007\u0010Î\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J@\u0010Ï\u0001\u001a\u00020\u00102\u0007\u0010É\u0001\u001a\u00020(2\b\u0010Ñ\u0001\u001a\u00030\u0092\u00012\u0007\u0010Ì\u0001\u001a\u00020(2\b\u0010Ò\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bÏ\u0001\u0010Ó\u0001JS\u0010Û\u0001\u001a\u00020\u00102\b\u0010Ô\u0001\u001a\u00030\u0086\u00012\u0007\u0010Õ\u0001\u001a\u00020\n2\b\u0010Ö\u0001\u001a\u00030\u0092\u00012\u0007\u0010×\u0001\u001a\u00020\n2\u0007\u0010Ø\u0001\u001a\u00020\n2\b\u0010Ú\u0001\u001a\u00030Ù\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0088\u0001\u0010å\u0001\u001a\u00020\u00102\b\u0010¢\u0001\u001a\u00030Ý\u00012\u0007\u0010Þ\u0001\u001a\u00020\n2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0094\u0001\u001a\u00020\n2\n\u0010ß\u0001\u001a\u0005\u0018\u00010\u0092\u00012\u0007\u0010à\u0001\u001a\u00020\n2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0007\u0010\u0095\u0001\u001a\u00020\n2\n\u0010â\u0001\u001a\u0005\u0018\u00010á\u00012\u0007\u0010ã\u0001\u001a\u00020\n2\u0007\u0010ä\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u001c\u0010é\u0001\u001a\u00020\u00102\b\u0010è\u0001\u001a\u00030ç\u0001H\u0016¢\u0006\u0006\bé\u0001\u0010ê\u0001J0\u0010î\u0001\u001a\u00020\u00102\b\u0010ì\u0001\u001a\u00030ë\u00012\n\u0010í\u0001\u001a\u0005\u0018\u00010¤\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bî\u0001\u0010ï\u0001J@\u0010ô\u0001\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ð\u00012\u0007\u0010ò\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020\n2\b\u0010ó\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bô\u0001\u0010õ\u0001J.\u0010ô\u0001\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ö\u00012\b\u0010ó\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bô\u0001\u0010÷\u0001JF\u0010ø\u0001\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ð\u00012\u0007\u0010ò\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bø\u0001\u0010ù\u0001J4\u0010ø\u0001\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ö\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bø\u0001\u0010ú\u0001JF\u0010ø\u0001\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ö\u00012\u0007\u0010û\u0001\u001a\u00020\n2\u0007\u0010ü\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bø\u0001\u0010ý\u0001JF\u0010ø\u0001\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030þ\u00012\u0007\u0010û\u0001\u001a\u00020\n2\u0007\u0010ü\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bø\u0001\u0010ÿ\u0001JP\u0010\u0082\u0002\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ð\u00012\u0007\u0010ò\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020\n2\u0006\u0010]\u001a\u00020\\2\u0007\u0010\u0080\u0002\u001a\u00020\r2\u0007\u0010\u0081\u0002\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J>\u0010\u0082\u0002\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ö\u00012\u0006\u0010]\u001a\u00020\\2\u0007\u0010\u0080\u0002\u001a\u00020\r2\u0007\u0010\u0081\u0002\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0082\u0002\u0010\u0084\u0002Ja\u0010\u0088\u0002\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030ð\u00012\u0007\u0010ò\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020\n2\u0007\u0010\u0085\u0002\u001a\u00020\n2\u0007\u0010\u0086\u0002\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u0087\u0002\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002Ja\u0010\u0088\u0002\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030þ\u00012\u0007\u0010û\u0001\u001a\u00020\n2\u0007\u0010ü\u0001\u001a\u00020\n2\u0007\u0010\u008a\u0002\u001a\u00020\n2\u0007\u0010\u008b\u0002\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u0087\u0002\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0088\u0002\u0010\u008c\u0002Ja\u0010\u0088\u0002\u001a\u00020\u00102\b\u0010ñ\u0001\u001a\u00030\u008d\u00022\u0007\u0010û\u0001\u001a\u00020\n2\u0007\u0010ü\u0001\u001a\u00020\n2\u0007\u0010\u008a\u0002\u001a\u00020\n2\u0007\u0010\u008b\u0002\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u0087\u0002\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0088\u0002\u0010\u008e\u0002R'\u0010\u0093\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u0011\u0010\u008f\u0002\u001a\u0005\b\u007f\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0016\u0010\u0095\u0002\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0094\u0002R\u0016\u0010\u0096\u0002\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0094\u0002R\u0016\u0010\u0098\u0002\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0097\u0002R\u001c\u0010\u009c\u0002\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001c\u0010\u009f\u0002\u001a\u00020\u00018\u0006¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u008f\u0002\u001a\u0006\b\u009e\u0002\u0010\u0090\u0002R\u001b\u0010¢\u0002\u001a\u00020\b8\u0006¢\u0006\u000f\n\u0005\b~\u0010\u0097\u0002\u001a\u0006\b \u0002\u0010¡\u0002R1\u0010§\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0¤\u00020£\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002¨\u0006¨\u0002"}, d2 = {"Lio/sentry/android/replay/screenshot/l;", "Landroid/graphics/Canvas;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "src", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Bitmap;Landroid/graphics/Paint;Landroid/graphics/Rect;)I", "", "x", "y", "Ljn0/h0;", "a", "(Landroid/graphics/Paint;FF)V", "Landroid/graphics/BitmapShader;", "c", "(Landroid/graphics/Paint;)Landroid/graphics/BitmapShader;", "", "isHardwareAccelerated", "()Z", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "bounds", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "alpha", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(Landroid/graphics/Rect;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "getClipBounds", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", "offset", "stride", Snapshot.WIDTH, Snapshot.HEIGHT, "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "Landroid/graphics/Mesh;", "mesh", "blendMode", "drawMesh", "(Landroid/graphics/Mesh;Landroid/graphics/BlendMode;Landroid/graphics/Paint;)V", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas;", "()Landroid/graphics/Canvas;", "e", "(Landroid/graphics/Canvas;)V", "delegate", "Landroid/graphics/Paint;", "solidPaint", "textPaint", "Landroid/graphics/Rect;", "tmpRect", "Landroid/graphics/Bitmap;", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmap", "f", "getSinglePixelCanvas", "singlePixelCanvas", "getSinglePixelBitmapBounds", "()Landroid/graphics/Rect;", "singlePixelBitmapBounds", "Ljava/util/WeakHashMap;", "Lkotlin/Pair;", "h", "Ljava/util/WeakHashMap;", "bitmapColorCache", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
final class l extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Canvas delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Paint solidPaint = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Paint textPaint = new Paint();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Rect tmpRect = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Bitmap singlePixelBitmap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Canvas singlePixelCanvas;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Rect singlePixelBitmapBounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<Bitmap, Pair<Integer, Integer>> bitmapColorCache;

    public l() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        this.singlePixelBitmap = bitmapCreateBitmap;
        this.singlePixelCanvas = new Canvas(bitmapCreateBitmap);
        this.singlePixelBitmapBounds = new Rect(0, 0, 1, 1);
        this.bitmapColorCache = new WeakHashMap<>();
    }

    private final void a(Paint paint, float x11, float y11) {
        this.textPaint.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        this.textPaint.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.tmpRect;
        drawRoundRect(rect.left + x11, rect.top + y11, rect.right + x11, rect.bottom + y11, 10.0f, 10.0f, this.textPaint);
    }

    private final BitmapShader c(Paint paint) {
        if (paint == null) {
            return null;
        }
        Shader shader = paint.getShader();
        if (!(shader instanceof BitmapShader)) {
            return null;
        }
        paint.setShader(null);
        return (BitmapShader) shader;
    }

    private final int d(Bitmap bitmap, Paint paint, Rect src) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        Pair<Integer, Integer> pair = this.bitmapColorCache.get(bitmap);
        if (pair != null && pair.e().intValue() == bitmap.getGenerationId()) {
            return pair.f().intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderC = c(paint);
            this.singlePixelCanvas.drawBitmap(bitmap.asShared(), src, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderC != null && paint != null) {
                paint.setShader(bitmapShaderC);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader bitmapShaderC2 = c(paint);
            this.singlePixelCanvas.drawBitmap(bitmap, src, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderC2 != null && paint != null) {
                paint.setShader(bitmapShaderC2);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        }
        this.bitmapColorCache.put(bitmap, new Pair<>(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    public final Canvas b() {
        Canvas canvas = this.delegate;
        if (canvas != null) {
            return canvas;
        }
        s.B("delegate");
        return null;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        s.k(path, "path");
        return b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rect) {
        s.k(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean clipPath(Path path, Region.Op op2) {
        s.k(path, "path");
        s.k(op2, "op");
        return b().clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean clipRect(RectF rect, Region.Op op2) {
        s.k(rect, "rect");
        s.k(op2, "op");
        return b().clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        b().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a11, int r11, int g11, int b11) {
        b().drawARGB(a11, r11, g11, b11);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        s.k(oval, "oval");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(oval, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public void drawBitmap(int[] colors, int offset, int stride, float x11, float y11, int width, int height, boolean hasAlpha, Paint paint) {
        s.k(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) {
        s.k(bitmap, "bitmap");
        s.k(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx2, float cy2, float radius, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawCircle(cx2, cy2, radius, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        b().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float outerRx, float outerRy, RectF inner, float innerRx, float innerRy, Paint paint) {
        s.k(outer, "outer");
        s.k(inner, "inner");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, Font font, Paint paint) {
        s.k(glyphIds, "glyphIds");
        s.k(positions, "positions");
        s.k(font, "font");
        s.k(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLine(startX, startY, stopX, stopY, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, int offset, int count, Paint paint) {
        s.k(pts, "pts");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(pts, offset, count, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        s.k(mesh, "mesh");
        s.k(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF oval, Paint paint) {
        s.k(oval, "oval");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(oval, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPaint(paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        s.k(patch, "patch");
        s.k(dst, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        s.k(path, "path");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPath(path, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        s.k(picture, "picture");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        b().drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, picture.getWidth(), picture.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x11, float y11, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoint(x11, y11, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(pts, offset, count, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public void drawPosText(String text, float[] pos, Paint paint) {
        s.k(text, "text");
        s.k(pos, "pos");
        s.k(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r11, int g11, int b11) {
        b().drawRGB(r11, g11, b11);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rect, Paint paint) {
        s.k(rect, "rect");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        s.k(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rect, float rx2, float ry2, Paint paint) {
        s.k(rect, "rect");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(rect, rx2, ry2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] text, int index, int count, float x11, float y11, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text, index, count, this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) {
        s.k(text, "text");
        s.k(path, "path");
        s.k(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x11, float y11, boolean isRtl, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text, 0, index + count, this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) {
        s.k(mode, "mode");
        s.k(verts, "verts");
        s.k(paint, "paint");
    }

    public final void e(Canvas canvas) {
        s.k(canvas, "<set-?>");
        this.delegate = canvas;
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        s.k(bounds, "bounds");
        return b().getClipBounds(bounds);
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return b().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return b().getHeight();
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public void getMatrix(Matrix ctm) {
        s.k(ctm, "ctm");
        b().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return b().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return b().isOpaque();
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        s.k(rect, "rect");
        s.k(type, "type");
        return b().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        b().restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        b().rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(bounds, paint, saveFlags);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        return b().saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx2, float sy2) {
        b().scale(sx2, sy2);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        b().setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter filter) {
        b().setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx2, float sy2) {
        b().skew(sx2, sy2);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx2, float dy2) {
        b().translate(dx2, dy2);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        s.k(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        s.k(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean clipRect(Rect rect, Region.Op op2) {
        s.k(rect, "rect");
        s.k(op2, "op");
        return b().clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public void drawBitmap(int[] colors, int offset, int stride, int x11, int y11, int width, int height, boolean hasAlpha, Paint paint) {
        s.k(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color) {
        b().drawColor(color);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) {
        s.k(text, "text");
        s.k(pos, "pos");
        s.k(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) {
        s.k(text, "text");
        s.k(path, "path");
        s.k(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect) {
        s.k(rect, "rect");
        return b().quickReject(rect);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        return b().saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        return b().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        s.k(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        s.k(bitmap, "bitmap");
        this.solidPaint.setColor(d(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        b().drawRect(left, top, left + bitmap.getWidth(), top + bitmap.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, PorterDuff.Mode mode) {
        s.k(mode, "mode");
        b().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, float x11, float y11, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd, float x11, float y11, boolean isRtl, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        s.k(path, "path");
        s.k(type, "type");
        return b().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        return b().saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        return b().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        s.k(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, BlendMode mode) {
        s.k(mode, "mode");
        b().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        s.k(outer, "outer");
        s.k(outerRadii, "outerRadii");
        s.k(inner, "inner");
        s.k(innerRadii, "innerRadii");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, Paint paint) {
        s.k(pts, "pts");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(pts, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(left, top, right, bottom, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        s.k(patch, "patch");
        s.k(dst, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF dst) {
        s.k(picture, "picture");
        s.k(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        b().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, Paint paint) {
        s.k(pts, "pts");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(pts, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect r11, Paint paint) {
        s.k(r11, "r");
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(r11, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx2, float ry2, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(left, top, right, bottom, rx2, ry2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        s.k(path, "path");
        return b().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(bounds, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        return b().saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op2) {
        s.k(op2, "op");
        return b().clipRect(left, top, right, bottom, op2);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color, BlendMode mode) {
        s.k(mode, "mode");
        b().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, int start, int end, float x11, float y11, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text, start, end, this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText text, int start, int end, int contextStart, int contextEnd, float x11, float y11, boolean isRtl, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public boolean quickReject(float left, float top, float right, float bottom, Canvas.EdgeType type) {
        s.k(type, "type");
        return b().quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        return b().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom) {
        return b().quickReject(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        return b().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
        s.k(bitmap, "bitmap");
        s.k(dst, "dst");
        this.solidPaint.setColor(d(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        b().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect dst) {
        s.k(picture, "picture");
        s.k(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        b().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        s.k(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(left, top, right, bottom, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence text, int start, int end, float x11, float y11, Paint paint) {
        s.k(text, "text");
        s.k(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.tmpRect);
        a(paint, x11, y11);
    }

    @Override // android.graphics.Canvas
    @jn0.e
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(left, top, right, bottom, paint, saveFlags);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(left, top, right, bottom, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) {
        s.k(bitmap, "bitmap");
        s.k(dst, "dst");
        this.solidPaint.setColor(d(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        b().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        s.k(bitmap, "bitmap");
        s.k(matrix, "matrix");
        this.solidPaint.setColor(d(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        int iSave = b().save();
        b().setMatrix(matrix);
        b().drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap.getWidth(), bitmap.getHeight(), this.solidPaint);
        b().restoreToCount(iSave);
    }
}
