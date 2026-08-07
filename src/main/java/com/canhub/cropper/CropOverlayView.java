package com.canhub.cropper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.Arrays;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 ×\u00012\u00020\u0001:\u0003r)\u0014B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ7\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u001f\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\nJ\u001f\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\nJ'\u00105\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\b¢\u0006\u0004\b7\u0010\nJ\u0015\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020(¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u0018¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u000202¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020(¢\u0006\u0004\bR\u0010BJ\u0015\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u0018¢\u0006\u0004\bT\u0010IJ\u0015\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u0018¢\u0006\u0004\bV\u0010IJ\u0015\u0010X\u001a\u00020(2\u0006\u0010W\u001a\u00020(¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020(2\u0006\u0010Z\u001a\u00020(¢\u0006\u0004\b[\u0010YJ\u001d\u0010^\u001a\u00020\b2\u0006\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u000202¢\u0006\u0004\b^\u0010_J\u001d\u0010b\u001a\u00020\b2\u0006\u0010`\u001a\u0002022\u0006\u0010a\u001a\u000202¢\u0006\u0004\bb\u0010_J-\u0010g\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u00182\u0006\u0010d\u001a\u00020\u00182\u0006\u0010e\u001a\u00020\u00182\u0006\u0010f\u001a\u00020\u0018¢\u0006\u0004\bg\u0010hJ\u0015\u0010k\u001a\u00020\b2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bm\u0010\u0013J\u0017\u0010p\u001a\u00020(2\u0006\u0010o\u001a\u00020nH\u0017¢\u0006\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010v\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010zR\u0016\u0010}\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010|R\u0016\u0010~\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0080\u0001R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010\u0082\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0084\u0001R\u001b\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u0087\u0001R\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0087\u0001R\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u0087\u0001R\u001b\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0087\u0001R\u001b\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u0087\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0094\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u0084\u0001R\u0018\u0010\u0096\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0095\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010sR\u0017\u0010\u0099\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010sR\u0017\u0010\u009a\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010sR\u0017\u0010\u009b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010sR\u0017\u0010\u009c\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010sR\u001b\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u009e\u0001R)\u0010£\u0001\u001a\u00020(2\u0007\u0010 \u0001\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¡\u0001\u0010|\u001a\u0006\b\u008e\u0001\u0010¢\u0001R\u0019\u0010¥\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0095\u0001R\u0019\u0010§\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0095\u0001R\u0018\u0010©\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010sR-\u0010N\u001a\u0004\u0018\u00010M2\t\u0010 \u0001\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R-\u00109\u001a\u0004\u0018\u0001082\t\u0010 \u0001\u001a\u0004\u0018\u0001088\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R-\u0010µ\u0001\u001a\u0004\u0018\u00010<2\t\u0010 \u0001\u001a\u0004\u0018\u00010<8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bs\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010·\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010|R\u0019\u0010º\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010»\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010sR\u0019\u0010½\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010\u0095\u0001R\u0018\u0010Á\u0001\u001a\u00030¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Ã\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010|R\u0016\u0010Å\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÄ\u0001\u0010sR\u0017\u0010Æ\u0001\u001a\u00020(8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010¢\u0001R(\u0010Ê\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0005\bÉ\u0001\u0010\u000eR)\u0010Ë\u0001\u001a\u0002022\u0007\u0010Ë\u0001\u001a\u0002028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0005\bÎ\u0001\u0010LR)\u0010Ï\u0001\u001a\u0002022\u0007\u0010Ï\u0001\u001a\u0002028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÐ\u0001\u0010Í\u0001\"\u0005\bÑ\u0001\u0010LR/\u0010Ö\u0001\u001a\u0005\u0018\u00010¾\u00012\t\u0010\f\u001a\u0005\u0018\u00010¾\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001¨\u0006Ø\u0001"}, d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljn0/h0;", "n", "()V", "Landroid/graphics/RectF;", "rect", "l", "(Landroid/graphics/RectF;)V", "w", "Landroid/graphics/Canvas;", "canvas", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Canvas;)V", "c", "j", DateTokenConverter.CONVERTER_KEY, "h", "", "cornerOffset", "cornerExtension", "f", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FF)V", "k", "radius", "g", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFF)V", "e", "x", "y", "q", "(FF)V", "s", "r", "", "b", "(Landroid/graphics/RectF;)Z", "Lcom/canhub/cropper/CropOverlayView$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCropWindowChangeListener", "(Lcom/canhub/cropper/CropOverlayView$b;)V", "m", "", "boundsPoints", "", "viewWidth", "viewHeight", "setBounds", "([FII)V", "t", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "setCropShape", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$b;", "cropCornerShape", "setCropCornerShape", "(Lcom/canhub/cropper/CropImageView$b;)V", "isEnabled", "setCropperTextLabelVisibility", "(Z)V", "", "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "setCropLabelTextSize", "(F)V", "textColor", "setCropLabelTextColor", "(I)V", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$e;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "multiTouchEnabled", "v", "(Z)Z", "centerMoveEnabled", "u", "minCropResultWidth", "minCropResultHeight", "setMinCropResultSize", "(II)V", "maxCropResultWidth", "maxCropResultHeight", "setMaxCropResultSize", "maxWidth", "maxHeight", "scaleFactorWidth", "scaleFactorHeight", "setCropWindowLimits", "(FFFF)V", "Lcom/canhub/cropper/o;", "options", "setInitialAttributeValues", "(Lcom/canhub/cropper/o;)V", "onDraw", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", Gender.FEMALE, "mCropCornerRadius", "Ljava/lang/Integer;", "mCircleCornerFillColor", "Lcom/canhub/cropper/o;", "mOptions", "Landroid/view/ScaleGestureDetector;", "Landroid/view/ScaleGestureDetector;", "mScaleDetector", "Z", "mMultiTouchEnabled", "mCenterMoveEnabled", "Lcom/canhub/cropper/p;", "Lcom/canhub/cropper/p;", "mCropWindowHandler", "Lcom/canhub/cropper/CropOverlayView$b;", "mCropWindowChangeListener", "Landroid/graphics/RectF;", "mDrawRect", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBorderPaint", "mBorderCornerPaint", "mGuidelinePaint", "mBackgroundPaint", "textLabelPaint", "Landroid/graphics/Path;", "o", "Landroid/graphics/Path;", "mPath", "p", "[F", "mBoundsPoints", "mCalcBounds", "I", "mViewWidth", "mViewHeight", "mBorderCornerOffset", "mBorderCornerLength", "mInitialCropWindowPaddingRatio", "mTouchRadius", "mSnapRadius", "Lcom/canhub/cropper/q;", "Lcom/canhub/cropper/q;", "mMoveHandler", "value", "z", "()Z", "isFixAspectRatio", "A", "mAspectRatioX", "B", "mAspectRatioY", "C", "mTargetAspectRatio", "D", "Lcom/canhub/cropper/CropImageView$e;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$e;", "E", "Lcom/canhub/cropper/CropImageView$d;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$d;", "Lcom/canhub/cropper/CropImageView$b;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "G", "isCropLabelEnabled", "H", "Ljava/lang/String;", "cropLabelText", "cropLabelTextSize", "J", "cropLabelTextColor", "Landroid/graphics/Rect;", "K", "Landroid/graphics/Rect;", "mInitialCropWindowRect", "L", "initializedCropWindow", Gender.MALE, "maxVerticalGestureExclusion", "isNonStraightAngleRotated", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", Gender.NONE, "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropOverlayView extends View {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int mAspectRatioX;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int mAspectRatioY;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float mTargetAspectRatio;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private CropImageView.e guidelines;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private CropImageView.d cropShape;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private CropImageView.b cornerShape;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isCropLabelEnabled;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private String cropLabelText;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float cropLabelTextSize;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int cropLabelTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final Rect mInitialCropWindowRect;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean initializedCropWindow;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final float maxVerticalGestureExclusion;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float mCropCornerRadius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer mCircleCornerFillColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CropImageOptions mOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ScaleGestureDetector mScaleDetector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean mMultiTouchEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean mCenterMoveEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p mCropWindowHandler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b mCropWindowChangeListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final RectF mDrawRect;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Paint mBorderPaint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Paint mBorderCornerPaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Paint mGuidelinePaint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Paint mBackgroundPaint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Paint textLabelPaint;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Path mPath;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float[] mBoundsPoints;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final RectF mCalcBounds;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mViewWidth;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int mViewHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float mBorderCornerOffset;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float mBorderCornerLength;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float mInitialCropWindowPaddingRatio;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float mTouchRadius;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float mSnapRadius;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private q mMoveHandler;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean isFixAspectRatio;

    /* JADX INFO: renamed from: com.canhub.cropper.CropOverlayView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/canhub/cropper/CropOverlayView$a;", "", "<init>", "()V", "Lcom/canhub/cropper/o;", "options", "Landroid/graphics/Paint;", DateTokenConverter.CONVERTER_KEY, "(Lcom/canhub/cropper/o;)Landroid/graphics/Paint;", "", "color", "a", "(I)Landroid/graphics/Paint;", "", "thickness", "b", "(FI)Landroid/graphics/Paint;", "c", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint a(int color) {
            Paint paint = new Paint();
            paint.setColor(color);
            return paint;
        }

        public final Paint b(float thickness, int color) {
            if (thickness <= BitmapDescriptorFactory.HUE_RED) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(color);
            paint.setStrokeWidth(thickness);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        public final Paint c(int color) {
            Paint paint = new Paint();
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        public final Paint d(CropImageOptions options) {
            p013kotlin.jvm.internal.s.k(options, "options");
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(options.cropperLabelTextSize);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(options.cropperLabelTextColor);
            return paint;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropOverlayView$b;", "", "", "inProgress", "Ljn0/h0;", "a", "(Z)V", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(boolean inProgress);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/canhub/cropper/CropOverlayView$c;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "(Lcom/canhub/cropper/CropOverlayView;)V", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScale", "(Landroid/view/ScaleGestureDetector;)Z", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            p013kotlin.jvm.internal.s.k(detector, "detector");
            RectF rectFI = CropOverlayView.this.mCropWindowHandler.i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f11 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f11;
            float currentSpanX = detector.getCurrentSpanX() / f11;
            float f12 = focusY - currentSpanY;
            float f13 = focusX - currentSpanX;
            float f14 = focusX + currentSpanX;
            float f15 = focusY + currentSpanY;
            if (f13 >= f14 || f12 > f15 || f13 < BitmapDescriptorFactory.HUE_RED || f14 > CropOverlayView.this.mCropWindowHandler.d() || f12 < BitmapDescriptorFactory.HUE_RED || f15 > CropOverlayView.this.mCropWindowHandler.c()) {
                return true;
            }
            rectFI.set(f13, f12, f14, f15);
            CropOverlayView.this.mCropWindowHandler.w(rectFI);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20980b;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            try {
                iArr[CropImageView.d.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_VERTICAL_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.d.OVAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20979a = iArr;
            int[] iArr2 = new int[CropImageView.b.values().length];
            try {
                iArr2[CropImageView.b.OVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CropImageView.b.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f20980b = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CropOverlayView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final boolean b(RectF rect) {
        float f11;
        float f12;
        com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
        float fA = cVar.A(this.mBoundsPoints);
        float fC = cVar.C(this.mBoundsPoints);
        float fB = cVar.B(this.mBoundsPoints);
        float fV = cVar.v(this.mBoundsPoints);
        if (!p()) {
            this.mCalcBounds.set(fA, fC, fB, fV);
            return false;
        }
        float[] fArr = this.mBoundsPoints;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        if (f18 < f14) {
            float f19 = fArr[3];
            if (f14 < f19) {
                f15 = fArr[2];
                f13 = f15;
                f14 = f16;
                f12 = f17;
                f16 = f19;
                f11 = f18;
            } else {
                f13 = fArr[2];
                f12 = f15;
                f15 = f13;
                f16 = f14;
                f14 = f19;
                f11 = f16;
            }
        } else {
            f11 = fArr[3];
            if (f14 > f11) {
                f12 = fArr[2];
                f15 = f17;
                f16 = f18;
            } else {
                f12 = f13;
                f11 = f14;
                f13 = f17;
                f14 = f18;
            }
        }
        float f21 = (f14 - f11) / (f13 - f12);
        float f22 = (-1.0f) / f21;
        float f23 = f11 - (f21 * f12);
        float f24 = f11 - (f12 * f22);
        float f25 = f16 - (f21 * f15);
        float f26 = f16 - (f15 * f22);
        float fCenterY = rect.centerY() - rect.top;
        float fCenterX = rect.centerX();
        float f27 = rect.left;
        float f28 = fCenterY / (fCenterX - f27);
        float f29 = -f28;
        float f31 = rect.top;
        float f32 = f31 - (f27 * f28);
        float f33 = rect.right;
        float f34 = f31 - (f29 * f33);
        float f35 = f21 - f28;
        float f36 = (f32 - f23) / f35;
        float fMax = Math.max(fA, f36 < f33 ? f36 : fA);
        float f37 = (f32 - f24) / (f22 - f28);
        if (f37 >= rect.right) {
            f37 = fMax;
        }
        float fMax2 = Math.max(fMax, f37);
        float f38 = f22 - f29;
        float f39 = (f34 - f26) / f38;
        float fMax3 = Math.max(fMax2, f39 < rect.right ? f39 : fMax2);
        float f41 = (f34 - f24) / f38;
        if (f41 <= rect.left) {
            f41 = fB;
        }
        float fMin = Math.min(fB, f41);
        float f42 = (f34 - f25) / (f21 - f29);
        if (f42 <= rect.left) {
            f42 = fMin;
        }
        float fMin2 = Math.min(fMin, f42);
        float f43 = (f32 - f25) / f35;
        if (f43 <= rect.left) {
            f43 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f43);
        float fMax4 = Math.max(fC, Math.max((f21 * fMax3) + f23, (f22 * fMin3) + f24));
        float fMin4 = Math.min(fV, Math.min((f22 * fMax3) + f26, (f21 * fMin3) + f25));
        RectF rectF = this.mCalcBounds;
        rectF.left = fMax3;
        rectF.top = fMax4;
        rectF.right = fMin3;
        rectF.bottom = fMin4;
        return true;
    }

    private final void c(Canvas canvas) {
        RectF rectFI = this.mCropWindowHandler.i();
        com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
        float fMax = Math.max(cVar.A(this.mBoundsPoints), BitmapDescriptorFactory.HUE_RED);
        float fMax2 = Math.max(cVar.C(this.mBoundsPoints), BitmapDescriptorFactory.HUE_RED);
        float fMin = Math.min(cVar.B(this.mBoundsPoints), getWidth());
        float fMin2 = Math.min(cVar.v(this.mBoundsPoints), getHeight());
        CropImageView.d dVar = this.cropShape;
        int i11 = dVar == null ? -1 : d.f20979a[dVar.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.mPath.reset();
            this.mDrawRect.set(rectFI.left, rectFI.top, rectFI.right, rectFI.bottom);
            this.mPath.addOval(this.mDrawRect, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.mPath);
            } else {
                canvas.clipPath(this.mPath, Region.Op.XOR);
            }
            Paint paint = this.mBackgroundPaint;
            p013kotlin.jvm.internal.s.h(paint);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint);
            canvas.restore();
            return;
        }
        if (!p()) {
            float f11 = rectFI.top;
            Paint paint2 = this.mBackgroundPaint;
            p013kotlin.jvm.internal.s.h(paint2);
            canvas.drawRect(fMax, fMax2, fMin, f11, paint2);
            float f12 = rectFI.bottom;
            Paint paint3 = this.mBackgroundPaint;
            p013kotlin.jvm.internal.s.h(paint3);
            canvas.drawRect(fMax, f12, fMin, fMin2, paint3);
            float f13 = rectFI.top;
            float f14 = rectFI.left;
            float f15 = rectFI.bottom;
            Paint paint4 = this.mBackgroundPaint;
            p013kotlin.jvm.internal.s.h(paint4);
            canvas.drawRect(fMax, f13, f14, f15, paint4);
            float f16 = rectFI.right;
            float f17 = rectFI.top;
            float f18 = rectFI.bottom;
            Paint paint5 = this.mBackgroundPaint;
            p013kotlin.jvm.internal.s.h(paint5);
            canvas.drawRect(f16, f17, fMin, f18, paint5);
            return;
        }
        this.mPath.reset();
        Path path = this.mPath;
        float[] fArr = this.mBoundsPoints;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.mPath;
        float[] fArr2 = this.mBoundsPoints;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.mPath;
        float[] fArr3 = this.mBoundsPoints;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.mPath;
        float[] fArr4 = this.mBoundsPoints;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.mPath.close();
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.mPath);
        } else {
            canvas.clipPath(this.mPath, Region.Op.INTERSECT);
        }
        Paint paint6 = this.mBackgroundPaint;
        p013kotlin.jvm.internal.s.h(paint6);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, paint6);
        canvas.restore();
    }

    private final void d(Canvas canvas) {
        Paint paint = this.mBorderPaint;
        if (paint != null) {
            p013kotlin.jvm.internal.s.h(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFI = this.mCropWindowHandler.i();
            float f11 = strokeWidth / 2;
            rectFI.inset(f11, f11);
            CropImageView.d dVar = this.cropShape;
            int i11 = dVar == null ? -1 : d.f20979a[dVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                Paint paint2 = this.mBorderPaint;
                p013kotlin.jvm.internal.s.h(paint2);
                canvas.drawRect(rectFI, paint2);
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.mBorderPaint;
                p013kotlin.jvm.internal.s.h(paint3);
                canvas.drawOval(rectFI, paint3);
            }
        }
    }

    private final void e(Canvas canvas, RectF rect, float cornerExtension, float radius) {
        float f11 = rect.left - cornerExtension;
        float f12 = rect.top - cornerExtension;
        Paint paint = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint);
        canvas.drawCircle(f11, f12, radius, paint);
        float f13 = rect.right + cornerExtension;
        float f14 = rect.top - cornerExtension;
        Paint paint2 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint2);
        canvas.drawCircle(f13, f14, radius, paint2);
        float f15 = rect.left - cornerExtension;
        float f16 = rect.bottom + cornerExtension;
        Paint paint3 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint3);
        canvas.drawCircle(f15, f16, radius, paint3);
        float f17 = rect.right + cornerExtension;
        float f18 = rect.bottom + cornerExtension;
        Paint paint4 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint4);
        canvas.drawCircle(f17, f18, radius, paint4);
    }

    private final void f(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        CropImageView.d dVar = this.cropShape;
        int i11 = dVar == null ? -1 : d.f20979a[dVar.ordinal()];
        if (i11 == 1) {
            g(canvas, rect, cornerOffset, cornerExtension, this.mCropCornerRadius);
            return;
        }
        if (i11 == 2) {
            float fCenterX = rect.centerX() - this.mBorderCornerLength;
            float f11 = rect.top - cornerOffset;
            float fCenterX2 = rect.centerX() + this.mBorderCornerLength;
            float f12 = rect.top - cornerOffset;
            Paint paint = this.mBorderCornerPaint;
            p013kotlin.jvm.internal.s.h(paint);
            canvas.drawLine(fCenterX, f11, fCenterX2, f12, paint);
            float fCenterX3 = rect.centerX() - this.mBorderCornerLength;
            float f13 = rect.bottom + cornerOffset;
            float fCenterX4 = rect.centerX() + this.mBorderCornerLength;
            float f14 = rect.bottom + cornerOffset;
            Paint paint2 = this.mBorderCornerPaint;
            p013kotlin.jvm.internal.s.h(paint2);
            canvas.drawLine(fCenterX3, f13, fCenterX4, f14, paint2);
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            k(canvas, rect, cornerOffset, cornerExtension);
            return;
        }
        float f15 = rect.left - cornerOffset;
        float fCenterY = rect.centerY() - this.mBorderCornerLength;
        float f16 = rect.left - cornerOffset;
        float fCenterY2 = rect.centerY() + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint3);
        canvas.drawLine(f15, fCenterY, f16, fCenterY2, paint3);
        float f17 = rect.right + cornerOffset;
        float fCenterY3 = rect.centerY() - this.mBorderCornerLength;
        float f18 = rect.right + cornerOffset;
        float fCenterY4 = rect.centerY() + this.mBorderCornerLength;
        Paint paint4 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint4);
        canvas.drawLine(f17, fCenterY3, f18, fCenterY4, paint4);
    }

    private final void g(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension, float radius) {
        CropImageView.b bVar = this.cornerShape;
        int i11 = bVar == null ? -1 : d.f20980b[bVar.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                e(canvas, rect, cornerOffset, radius);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                k(canvas, rect, cornerOffset, cornerExtension);
            }
        }
    }

    private final void h(Canvas canvas) {
        float strokeWidth;
        Paint paintC;
        if (this.mBorderCornerPaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                p013kotlin.jvm.internal.s.h(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = BitmapDescriptorFactory.HUE_RED;
            }
            Paint paint2 = this.mBorderCornerPaint;
            p013kotlin.jvm.internal.s.h(paint2);
            float strokeWidth2 = paint2.getStrokeWidth();
            float f11 = 2;
            float f12 = (strokeWidth2 - strokeWidth) / f11;
            float f13 = strokeWidth2 / f11;
            float f14 = f13 + f12;
            CropImageView.d dVar = this.cropShape;
            int i11 = dVar == null ? -1 : d.f20979a[dVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                f13 += this.mBorderCornerOffset;
            } else if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFI = this.mCropWindowHandler.i();
            rectFI.inset(f13, f13);
            f(canvas, rectFI, f12, f14);
            if (this.cornerShape == CropImageView.b.OVAL) {
                Integer num = this.mCircleCornerFillColor;
                if (num != null) {
                    paintC = INSTANCE.c(num.intValue());
                } else {
                    paintC = null;
                }
                this.mBorderCornerPaint = paintC;
                f(canvas, rectFI, f12, f14);
            }
        }
    }

    private final void i(Canvas canvas) {
        if (this.isCropLabelEnabled) {
            RectF rectFI = this.mCropWindowHandler.i();
            float f11 = (rectFI.left + rectFI.right) / 2;
            float f12 = rectFI.top - 50;
            Paint paint = this.textLabelPaint;
            if (paint != null) {
                paint.setTextSize(this.cropLabelTextSize);
                paint.setColor(this.cropLabelTextColor);
            }
            String str = this.cropLabelText;
            Paint paint2 = this.textLabelPaint;
            p013kotlin.jvm.internal.s.h(paint2);
            canvas.drawText(str, f11, f12, paint2);
            canvas.save();
        }
    }

    private final void j(Canvas canvas) {
        float strokeWidth;
        if (this.mGuidelinePaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                p013kotlin.jvm.internal.s.h(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = BitmapDescriptorFactory.HUE_RED;
            }
            RectF rectFI = this.mCropWindowHandler.i();
            rectFI.inset(strokeWidth, strokeWidth);
            float f11 = 3;
            float fWidth = rectFI.width() / f11;
            float fHeight = rectFI.height() / f11;
            CropImageView.d dVar = this.cropShape;
            int i11 = dVar == null ? -1 : d.f20979a[dVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                float f12 = rectFI.left + fWidth;
                float f13 = rectFI.right - fWidth;
                float f14 = rectFI.top;
                float f15 = rectFI.bottom;
                Paint paint2 = this.mGuidelinePaint;
                p013kotlin.jvm.internal.s.h(paint2);
                canvas.drawLine(f12, f14, f12, f15, paint2);
                float f16 = rectFI.top;
                float f17 = rectFI.bottom;
                Paint paint3 = this.mGuidelinePaint;
                p013kotlin.jvm.internal.s.h(paint3);
                canvas.drawLine(f13, f16, f13, f17, paint3);
                float f18 = rectFI.top + fHeight;
                float f19 = rectFI.bottom - fHeight;
                float f21 = rectFI.left;
                float f22 = rectFI.right;
                Paint paint4 = this.mGuidelinePaint;
                p013kotlin.jvm.internal.s.h(paint4);
                canvas.drawLine(f21, f18, f22, f18, paint4);
                float f23 = rectFI.left;
                float f24 = rectFI.right;
                Paint paint5 = this.mGuidelinePaint;
                p013kotlin.jvm.internal.s.h(paint5);
                canvas.drawLine(f23, f19, f24, f19, paint5);
                return;
            }
            if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f25 = 2;
            float fWidth2 = (rectFI.width() / f25) - strokeWidth;
            float fHeight2 = (rectFI.height() / f25) - strokeWidth;
            float f26 = rectFI.left + fWidth;
            float f27 = rectFI.right - fWidth;
            float fSin = (float) (((double) fHeight2) * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            float f28 = (rectFI.top + fHeight2) - fSin;
            float f29 = (rectFI.bottom - fHeight2) + fSin;
            Paint paint6 = this.mGuidelinePaint;
            p013kotlin.jvm.internal.s.h(paint6);
            canvas.drawLine(f26, f28, f26, f29, paint6);
            float f31 = (rectFI.top + fHeight2) - fSin;
            float f32 = (rectFI.bottom - fHeight2) + fSin;
            Paint paint7 = this.mGuidelinePaint;
            p013kotlin.jvm.internal.s.h(paint7);
            canvas.drawLine(f27, f31, f27, f32, paint7);
            float f33 = rectFI.top + fHeight;
            float f34 = rectFI.bottom - fHeight;
            float fCos = (float) (((double) fWidth2) * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            float f35 = (rectFI.left + fWidth2) - fCos;
            float f36 = (rectFI.right - fWidth2) + fCos;
            Paint paint8 = this.mGuidelinePaint;
            p013kotlin.jvm.internal.s.h(paint8);
            canvas.drawLine(f35, f33, f36, f33, paint8);
            float f37 = (rectFI.left + fWidth2) - fCos;
            float f38 = (rectFI.right - fWidth2) + fCos;
            Paint paint9 = this.mGuidelinePaint;
            p013kotlin.jvm.internal.s.h(paint9);
            canvas.drawLine(f37, f34, f38, f34, paint9);
        }
    }

    private final void k(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = f12 + this.mBorderCornerLength;
        Paint paint = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint);
        canvas.drawLine(f11 - cornerOffset, f12 - cornerExtension, f11 - cornerOffset, f13, paint);
        float f14 = rect.left;
        float f15 = rect.top;
        Paint paint2 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint2);
        canvas.drawLine(f14 - cornerExtension, f15 - cornerOffset, f14 + this.mBorderCornerLength, f15 - cornerOffset, paint2);
        float f16 = rect.right;
        float f17 = rect.top;
        float f18 = f17 + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint3);
        canvas.drawLine(f16 + cornerOffset, f17 - cornerExtension, f16 + cornerOffset, f18, paint3);
        float f19 = rect.right;
        float f21 = rect.top;
        Paint paint4 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint4);
        canvas.drawLine(f19 + cornerExtension, f21 - cornerOffset, f19 - this.mBorderCornerLength, f21 - cornerOffset, paint4);
        float f22 = rect.left;
        float f23 = rect.bottom;
        float f24 = f23 - this.mBorderCornerLength;
        Paint paint5 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint5);
        canvas.drawLine(f22 - cornerOffset, f23 + cornerExtension, f22 - cornerOffset, f24, paint5);
        float f25 = rect.left;
        float f26 = rect.bottom;
        Paint paint6 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint6);
        canvas.drawLine(f25 - cornerExtension, f26 + cornerOffset, f25 + this.mBorderCornerLength, f26 + cornerOffset, paint6);
        float f27 = rect.right;
        float f28 = rect.bottom;
        float f29 = f28 - this.mBorderCornerLength;
        Paint paint7 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint7);
        canvas.drawLine(f27 + cornerOffset, f28 + cornerExtension, f27 + cornerOffset, f29, paint7);
        float f31 = rect.right;
        float f32 = rect.bottom;
        Paint paint8 = this.mBorderCornerPaint;
        p013kotlin.jvm.internal.s.h(paint8);
        canvas.drawLine(f31 + cornerExtension, f32 + cornerOffset, f31 - this.mBorderCornerLength, f32 + cornerOffset, paint8);
    }

    private final void l(RectF rect) {
        if (rect.width() < this.mCropWindowHandler.f()) {
            float f11 = (this.mCropWindowHandler.f() - rect.width()) / 2;
            rect.left -= f11;
            rect.right += f11;
        }
        if (rect.height() < this.mCropWindowHandler.e()) {
            float fE = (this.mCropWindowHandler.e() - rect.height()) / 2;
            rect.top -= fE;
            rect.bottom += fE;
        }
        if (rect.width() > this.mCropWindowHandler.d()) {
            float fWidth = (rect.width() - this.mCropWindowHandler.d()) / 2;
            rect.left += fWidth;
            rect.right -= fWidth;
        }
        if (rect.height() > this.mCropWindowHandler.c()) {
            float fHeight = (rect.height() - this.mCropWindowHandler.c()) / 2;
            rect.top += fHeight;
            rect.bottom -= fHeight;
        }
        b(rect);
        if (this.mCalcBounds.width() > BitmapDescriptorFactory.HUE_RED && this.mCalcBounds.height() > BitmapDescriptorFactory.HUE_RED) {
            float fMax = Math.max(this.mCalcBounds.left, BitmapDescriptorFactory.HUE_RED);
            float fMax2 = Math.max(this.mCalcBounds.top, BitmapDescriptorFactory.HUE_RED);
            float fMin = Math.min(this.mCalcBounds.right, getWidth());
            float fMin2 = Math.min(this.mCalcBounds.bottom, getHeight());
            if (rect.left < fMax) {
                rect.left = fMax;
            }
            if (rect.top < fMax2) {
                rect.top = fMax2;
            }
            if (rect.right > fMin) {
                rect.right = fMin;
            }
            if (rect.bottom > fMin2) {
                rect.bottom = fMin2;
            }
        }
        if (!this.isFixAspectRatio || Math.abs(rect.width() - (rect.height() * this.mTargetAspectRatio)) <= 0.1d) {
            return;
        }
        if (rect.width() > rect.height() * this.mTargetAspectRatio) {
            float fAbs = Math.abs((rect.height() * this.mTargetAspectRatio) - rect.width()) / 2;
            rect.left += fAbs;
            rect.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rect.width() / this.mTargetAspectRatio) - rect.height()) / 2;
            rect.top += fAbs2;
            rect.bottom -= fAbs2;
        }
    }

    private final void n() {
        com.canhub.cropper.c cVar = com.canhub.cropper.c.f21036a;
        float fMax = Math.max(cVar.A(this.mBoundsPoints), BitmapDescriptorFactory.HUE_RED);
        float fMax2 = Math.max(cVar.C(this.mBoundsPoints), BitmapDescriptorFactory.HUE_RED);
        float fMin = Math.min(cVar.B(this.mBoundsPoints), getWidth());
        float fMin2 = Math.min(cVar.v(this.mBoundsPoints), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.initializedCropWindow = true;
        float f11 = this.mInitialCropWindowPaddingRatio;
        float f12 = fMin - fMax;
        float f13 = f11 * f12;
        float f14 = fMin2 - fMax2;
        float f15 = f11 * f14;
        if (this.mInitialCropWindowRect.width() > 0 && this.mInitialCropWindowRect.height() > 0) {
            rectF.left = (this.mInitialCropWindowRect.left / this.mCropWindowHandler.getMScaleFactorWidth()) + fMax;
            rectF.top = (this.mInitialCropWindowRect.top / this.mCropWindowHandler.getMScaleFactorHeight()) + fMax2;
            rectF.right = rectF.left + (this.mInitialCropWindowRect.width() / this.mCropWindowHandler.getMScaleFactorWidth());
            rectF.bottom = rectF.top + (this.mInitialCropWindowRect.height() / this.mCropWindowHandler.getMScaleFactorHeight());
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.isFixAspectRatio || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f13;
            rectF.top = fMax2 + f15;
            rectF.right = fMin - f13;
            rectF.bottom = fMin2 - f15;
        } else if (f12 / f14 > this.mTargetAspectRatio) {
            rectF.top = fMax2 + f15;
            rectF.bottom = fMin2 - f15;
            float width = getWidth() / 2.0f;
            this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
            float fMax3 = Math.max(this.mCropWindowHandler.f(), rectF.height() * this.mTargetAspectRatio) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f13;
            rectF.right = fMin - f13;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.mCropWindowHandler.e(), rectF.width() / this.mTargetAspectRatio) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        l(rectF);
        this.mCropWindowHandler.w(rectF);
    }

    private final boolean p() {
        float[] fArr = this.mBoundsPoints;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private final void q(float x11, float y11) {
        p pVar = this.mCropWindowHandler;
        float f11 = this.mTouchRadius;
        CropImageView.d dVar = this.cropShape;
        p013kotlin.jvm.internal.s.h(dVar);
        q qVarG = pVar.g(x11, y11, f11, dVar, this.mCenterMoveEnabled);
        this.mMoveHandler = qVarG;
        if (qVarG != null) {
            invalidate();
        }
    }

    private final void r(float x11, float y11) {
        if (this.mMoveHandler != null) {
            float f11 = this.mSnapRadius;
            RectF rectFI = this.mCropWindowHandler.i();
            if (b(rectFI)) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            q qVar = this.mMoveHandler;
            p013kotlin.jvm.internal.s.h(qVar);
            qVar.l(rectFI, x11, y11, this.mCalcBounds, this.mViewWidth, this.mViewHeight, f11, this.isFixAspectRatio, this.mTargetAspectRatio);
            this.mCropWindowHandler.w(rectFI);
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(true);
            }
            invalidate();
        }
    }

    private final void s() {
        if (this.mMoveHandler != null) {
            this.mMoveHandler = null;
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(false);
            }
            invalidate();
        }
    }

    private final void w() {
        RectF rectFI = this.mCropWindowHandler.i();
        List<Rect> systemGestureExclusionRects = getSystemGestureExclusionRects();
        p013kotlin.jvm.internal.s.j(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
        Rect rect = systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect();
        List<Rect> systemGestureExclusionRects2 = getSystemGestureExclusionRects();
        p013kotlin.jvm.internal.s.j(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
        Rect rect2 = 1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect();
        List<Rect> systemGestureExclusionRects3 = getSystemGestureExclusionRects();
        p013kotlin.jvm.internal.s.j(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
        Rect rect3 = 2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect();
        float f11 = rectFI.left;
        float f12 = this.mTouchRadius;
        int i11 = (int) (f11 - f12);
        rect.left = i11;
        int i12 = (int) (rectFI.right + f12);
        rect.right = i12;
        float f13 = rectFI.top;
        int i13 = (int) (f13 - f12);
        rect.top = i13;
        float f14 = this.maxVerticalGestureExclusion;
        rect.bottom = (int) (i13 + (f14 * 0.3f));
        rect2.left = i11;
        rect2.right = i12;
        float f15 = rectFI.bottom;
        int i14 = (int) (((f13 + f15) / 2.0f) - (0.2f * f14));
        rect2.top = i14;
        rect2.bottom = (int) (i14 + (0.4f * f14));
        rect3.left = rect.left;
        rect3.right = rect.right;
        int i15 = (int) (f15 + f12);
        rect3.bottom = i15;
        rect3.top = (int) (i15 - (f14 * 0.3f));
        setSystemGestureExclusionRects(p013kotlin.collections.v.p(rect, rect2, rect3));
    }

    /* JADX INFO: renamed from: getAspectRatioX, reason: from getter */
    public final int getMAspectRatioX() {
        return this.mAspectRatioX;
    }

    /* JADX INFO: renamed from: getAspectRatioY, reason: from getter */
    public final int getMAspectRatioY() {
        return this.mAspectRatioY;
    }

    public final CropImageView.b getCornerShape() {
        return this.cornerShape;
    }

    public final CropImageView.d getCropShape() {
        return this.cropShape;
    }

    public final RectF getCropWindowRect() {
        return this.mCropWindowHandler.i();
    }

    public final CropImageView.e getGuidelines() {
        return this.guidelines;
    }

    /* JADX INFO: renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getMInitialCropWindowRect() {
        return this.mInitialCropWindowRect;
    }

    public final void m() {
        RectF cropWindowRect = getCropWindowRect();
        l(cropWindowRect);
        this.mCropWindowHandler.w(cropWindowRect);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsFixAspectRatio() {
        return this.isFixAspectRatio;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        super.onDraw(canvas);
        c(canvas);
        if (this.mCropWindowHandler.x()) {
            CropImageView.e eVar = this.guidelines;
            if (eVar == CropImageView.e.ON) {
                j(canvas);
            } else if (eVar == CropImageView.e.ON_TOUCH && this.mMoveHandler != null) {
                j(canvas);
            }
        }
        Companion companion = INSTANCE;
        CropImageOptions cropImageOptions = this.mOptions;
        this.mBorderCornerPaint = companion.b(cropImageOptions != null ? cropImageOptions.borderCornerThickness : BitmapDescriptorFactory.HUE_RED, cropImageOptions != null ? cropImageOptions.borderCornerColor : -1);
        i(canvas);
        d(canvas);
        h(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            w();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        p013kotlin.jvm.internal.s.k(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.mMultiTouchEnabled && (scaleGestureDetector = this.mScaleDetector) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            q(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                r(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        s();
        return true;
    }

    public final void setAspectRatioX(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioX != i11) {
            this.mAspectRatioX = i11;
            this.mTargetAspectRatio = i11 / this.mAspectRatioY;
            if (this.initializedCropWindow) {
                n();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioY != i11) {
            this.mAspectRatioY = i11;
            this.mTargetAspectRatio = this.mAspectRatioX / i11;
            if (this.initializedCropWindow) {
                n();
                invalidate();
            }
        }
    }

    public final void setBounds(float[] boundsPoints, int viewWidth, int viewHeight) {
        if (boundsPoints == null || !Arrays.equals(this.mBoundsPoints, boundsPoints)) {
            if (boundsPoints == null) {
                Arrays.fill(this.mBoundsPoints, BitmapDescriptorFactory.HUE_RED);
            } else {
                System.arraycopy(boundsPoints, 0, this.mBoundsPoints, 0, boundsPoints.length);
            }
            this.mViewWidth = viewWidth;
            this.mViewHeight = viewHeight;
            RectF rectFI = this.mCropWindowHandler.i();
            if (rectFI.width() == BitmapDescriptorFactory.HUE_RED || rectFI.height() == BitmapDescriptorFactory.HUE_RED) {
                n();
            }
        }
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.mCropCornerRadius = cornerRadius;
    }

    public final void setCropCornerShape(CropImageView.b cropCornerShape) {
        p013kotlin.jvm.internal.s.k(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String textLabel) {
        if (textLabel != null) {
            this.cropLabelText = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.cropLabelTextColor = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.cropLabelTextSize = textSize;
        invalidate();
    }

    public final void setCropShape(CropImageView.d cropShape) {
        p013kotlin.jvm.internal.s.k(cropShape, "cropShape");
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(b listener) {
        this.mCropWindowChangeListener = listener;
    }

    public final void setCropWindowLimits(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mCropWindowHandler.s(maxWidth, maxHeight, scaleFactorWidth, scaleFactorHeight);
    }

    public final void setCropWindowRect(RectF rect) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        this.mCropWindowHandler.w(rect);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.isCropLabelEnabled = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.isFixAspectRatio != fixAspectRatio) {
            this.isFixAspectRatio = fixAspectRatio;
            if (this.initializedCropWindow) {
                n();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.e guidelines) {
        p013kotlin.jvm.internal.s.k(guidelines, "guidelines");
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.initializedCropWindow) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions options) {
        b bVar;
        p013kotlin.jvm.internal.s.k(options, "options");
        boolean zF = p013kotlin.jvm.internal.s.f(this.mOptions, options);
        CropImageOptions cropImageOptions = this.mOptions;
        boolean z11 = cropImageOptions == null || options.fixAspectRatio != cropImageOptions.fixAspectRatio || cropImageOptions == null || options.aspectRatioX != cropImageOptions.aspectRatioX || cropImageOptions == null || options.aspectRatioY != cropImageOptions.aspectRatioY;
        this.mOptions = options;
        this.mCropWindowHandler.v(options.minCropResultWidth, options.minCropResultHeight);
        this.mCropWindowHandler.u(options.maxCropResultWidth, options.maxCropResultHeight);
        if (zF) {
            return;
        }
        this.mCropWindowHandler.t(options);
        this.cropLabelTextColor = options.cropperLabelTextColor;
        this.cropLabelTextSize = options.cropperLabelTextSize;
        String str = options.cropperLabelText;
        if (str == null) {
            str = "";
        }
        this.cropLabelText = str;
        this.isCropLabelEnabled = options.showCropLabel;
        this.mCropCornerRadius = options.cropCornerRadius;
        this.cornerShape = options.cornerShape;
        this.cropShape = options.cropShape;
        this.mSnapRadius = options.snapRadius;
        setEnabled(options.canChangeCropWindow);
        this.guidelines = options.guidelines;
        this.isFixAspectRatio = options.fixAspectRatio;
        setAspectRatioX(options.aspectRatioX);
        setAspectRatioY(options.aspectRatioY);
        boolean z12 = options.multiTouchEnabled;
        this.mMultiTouchEnabled = z12;
        if (z12 && this.mScaleDetector == null) {
            this.mScaleDetector = new ScaleGestureDetector(getContext(), new c());
        }
        this.mCenterMoveEnabled = options.centerMoveEnabled;
        this.mTouchRadius = options.touchRadius;
        this.mInitialCropWindowPaddingRatio = options.initialCropWindowPaddingRatio;
        Companion companion = INSTANCE;
        this.mBorderPaint = companion.b(options.borderLineThickness, options.borderLineColor);
        this.mBorderCornerOffset = options.borderCornerOffset;
        this.mBorderCornerLength = options.borderCornerLength;
        this.mCircleCornerFillColor = Integer.valueOf(options.circleCornerFillColorHexValue);
        this.mBorderCornerPaint = companion.b(options.borderCornerThickness, options.borderCornerColor);
        this.mGuidelinePaint = companion.b(options.guidelinesThickness, options.guidelinesColor);
        this.mBackgroundPaint = companion.a(options.backgroundColor);
        this.textLabelPaint = companion.d(options);
        if (z11) {
            n();
        }
        invalidate();
        if (!z11 || (bVar = this.mCropWindowChangeListener) == null) {
            return;
        }
        bVar.a(false);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.mInitialCropWindowRect;
        if (rect == null) {
            rect = com.canhub.cropper.c.f21036a.o();
        }
        rect2.set(rect);
        if (this.initializedCropWindow) {
            n();
            invalidate();
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    public final void setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
        this.mCropWindowHandler.u(maxCropResultWidth, maxCropResultHeight);
    }

    public final void setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
        this.mCropWindowHandler.v(minCropResultWidth, minCropResultHeight);
    }

    public final void setSnapRadius(float snapRadius) {
        this.mSnapRadius = snapRadius;
    }

    public final void t() {
        if (this.initializedCropWindow) {
            setCropWindowRect(com.canhub.cropper.c.f21036a.p());
            n();
            invalidate();
        }
    }

    public final boolean u(boolean centerMoveEnabled) {
        if (this.mCenterMoveEnabled == centerMoveEnabled) {
            return false;
        }
        this.mCenterMoveEnabled = centerMoveEnabled;
        return true;
    }

    public final boolean v(boolean multiTouchEnabled) {
        if (this.mMultiTouchEnabled == multiTouchEnabled) {
            return false;
        }
        this.mMultiTouchEnabled = multiTouchEnabled;
        if (!multiTouchEnabled || this.mScaleDetector != null) {
            return true;
        }
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new c());
        return true;
    }

    public /* synthetic */ CropOverlayView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.mCenterMoveEnabled = true;
        this.mCropWindowHandler = new p();
        this.mDrawRect = new RectF();
        this.mPath = new Path();
        this.mBoundsPoints = new float[8];
        this.mCalcBounds = new RectF();
        this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
        this.cropLabelText = "";
        this.cropLabelTextSize = 20.0f;
        this.cropLabelTextColor = -1;
        this.mInitialCropWindowRect = new Rect();
        this.maxVerticalGestureExclusion = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }
}
