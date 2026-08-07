package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import p014n4.j0;
import w4.v;
import w4.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0003\b\u0090\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001d\u0010\u0010\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u001b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0018\u0010\rR\u001d\u0010\u001d\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\rR\u001d\u0010\u001f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001c\u0010\rR\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010%\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\"\u0010\rR\u001d\u0010'\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b$\u0010\rR\u001d\u0010)\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b&\u0010\rR\u0017\u0010+\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b(\u0010\u0016R\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b*\u0010\bR\u001d\u0010/\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b,\u0010\rR\u001d\u00101\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b.\u0010\rR\u001d\u00103\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b0\u0010\rR\u0017\u00105\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b4\u0010\u0015\u001a\u0004\b2\u0010\u0016R\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u00109\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b6\u0010\rR\u001d\u0010;\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b8\u0010\rR\u001d\u0010=\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b:\u0010\rR\u0017\u0010?\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u0010\u0015\u001a\u0004\b<\u0010\u0016R\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010C\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010\f\u001a\u0004\b@\u0010\rR\u001d\u0010E\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bB\u0010\rR\u001d\u0010G\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010\f\u001a\u0004\bD\u0010\rR\u0017\u0010I\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bH\u0010\u0015\u001a\u0004\bF\u0010\u0016R\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bH\u0010\bR\u001d\u0010M\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bJ\u0010\rR\u001d\u0010O\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010\f\u001a\u0004\bL\u0010\rR\u001d\u0010Q\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bN\u0010\rR\u0017\u0010R\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\bP\u0010\u0016R\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010V\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010\f\u001a\u0004\bS\u0010\rR\u001d\u0010X\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010\f\u001a\u0004\bU\u0010\rR\u001d\u0010Z\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010\f\u001a\u0004\bW\u0010\rR\u0017\u0010\\\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b[\u0010\u0015\u001a\u0004\bY\u0010\u0016R\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b[\u0010\bR\u001d\u0010`\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010\f\u001a\u0004\b]\u0010\rR\u001d\u0010b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\b_\u0010\rR\u001d\u0010d\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010\f\u001a\u0004\ba\u0010\rR\u0017\u0010f\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\be\u0010\u0015\u001a\u0004\bc\u0010\u0016R\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\be\u0010\bR\u001d\u0010j\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bi\u0010\f\u001a\u0004\bg\u0010\rR\u001d\u0010l\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010\f\u001a\u0004\bi\u0010\rR\u001d\u0010n\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bk\u0010\rR\u0017\u0010p\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bo\u0010\u0015\u001a\u0004\bm\u0010\u0016R\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\bo\u0010\bR\u001d\u0010t\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bs\u0010\f\u001a\u0004\bq\u0010\rR\u001d\u0010v\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bu\u0010\f\u001a\u0004\bs\u0010\rR\u001d\u0010x\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bw\u0010\f\u001a\u0004\bu\u0010\rR\u0017\u0010z\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\by\u0010\u0015\u001a\u0004\bw\u0010\u0016R\u0017\u0010|\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\by\u0010\bR\u001d\u0010~\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b}\u0010\f\u001a\u0004\b{\u0010\rR\u001e\u0010\u0080\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u007f\u0010\f\u001a\u0004\b}\u0010\rR\u001f\u0010\u0082\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0081\u0001\u0010\f\u001a\u0004\b\u007f\u0010\rR\u001a\u0010\u0084\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0015\u001a\u0005\b\u0081\u0001\u0010\u0016R\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR \u0010\u0088\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\f\u001a\u0005\b\u0085\u0001\u0010\rR \u0010\u008a\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\f\u001a\u0005\b\u0087\u0001\u0010\rR \u0010\u008c\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\f\u001a\u0005\b\u0089\u0001\u0010\rR\u001a\u0010\u008e\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0015\u001a\u0005\b\u008b\u0001\u0010\u0016R\u001a\u0010\u0090\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u008d\u0001\u0010\bR \u0010\u0092\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\f\u001a\u0005\b\u008f\u0001\u0010\rR \u0010\u0094\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\f\u001a\u0005\b\u0091\u0001\u0010\rR \u0010\u0096\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\f\u001a\u0005\b\u0093\u0001\u0010\rR\u001a\u0010\u0098\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0015\u001a\u0005\b\u0095\u0001\u0010\u0016R\u001a\u0010\u009a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR \u0010\u009c\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\f\u001a\u0005\b\u0099\u0001\u0010\rR \u0010\u009e\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\f\u001a\u0005\b\u009b\u0001\u0010\rR \u0010 \u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\f\u001a\u0005\b\u009d\u0001\u0010\rR\u001a\u0010¢\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0015\u001a\u0005\b\u009f\u0001\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006£\u0001"}, d2 = {"Lq2/m;", "", "<init>", "()V", "Ln4/j0;", "b", "Ln4/j0;", "a", "()Ln4/j0;", "BodyLargeFont", "Lw4/v;", "c", "J", "()J", "BodyLargeLineHeight", DateTokenConverter.CONVERTER_KEY, "BodyLargeSize", "e", "BodyLargeTracking", "Ln4/f0;", "f", "Ln4/f0;", "()Ln4/f0;", "BodyLargeWeight", "g", "BodyMediumFont", "h", "BodyMediumLineHeight", IntegerTokenConverter.CONVERTER_KEY, "BodyMediumSize", "j", "BodyMediumTracking", "k", "BodyMediumWeight", "l", "BodySmallFont", "m", "BodySmallLineHeight", "n", "BodySmallSize", "o", "BodySmallTracking", "p", "BodySmallWeight", "q", "DisplayLargeFont", "r", "DisplayLargeLineHeight", "s", "DisplayLargeSize", "t", "DisplayLargeTracking", "u", "DisplayLargeWeight", "v", "DisplayMediumFont", "w", "DisplayMediumLineHeight", "x", "DisplayMediumSize", "y", "DisplayMediumTracking", "z", "DisplayMediumWeight", "A", "DisplaySmallFont", "B", "DisplaySmallLineHeight", "C", "DisplaySmallSize", "D", "DisplaySmallTracking", "E", "DisplaySmallWeight", Gender.FEMALE, "HeadlineLargeFont", "G", "HeadlineLargeLineHeight", "H", "HeadlineLargeSize", "I", "HeadlineLargeTracking", "HeadlineLargeWeight", "K", "HeadlineMediumFont", "L", "HeadlineMediumLineHeight", Gender.MALE, "HeadlineMediumSize", Gender.NONE, "HeadlineMediumTracking", Gender.OTHER, "HeadlineMediumWeight", "P", "HeadlineSmallFont", "Q", "HeadlineSmallLineHeight", "R", "HeadlineSmallSize", "S", "HeadlineSmallTracking", "T", "HeadlineSmallWeight", Gender.UNKNOWN, "LabelLargeFont", "V", "LabelLargeLineHeight", "W", "LabelLargeSize", "X", "LabelLargeTracking", "Y", "LabelLargeWeight", "Z", "LabelMediumFont", "a0", "LabelMediumLineHeight", "b0", "LabelMediumSize", "c0", "LabelMediumTracking", "d0", "LabelMediumWeight", "e0", "LabelSmallFont", "f0", "LabelSmallLineHeight", "g0", "LabelSmallSize", "h0", "LabelSmallTracking", "i0", "LabelSmallWeight", "j0", "TitleLargeFont", "k0", "TitleLargeLineHeight", "l0", "TitleLargeSize", "m0", "TitleLargeTracking", "n0", "TitleLargeWeight", "o0", "TitleMediumFont", "p0", "TitleMediumLineHeight", "q0", "TitleMediumSize", "r0", "TitleMediumTracking", "s0", "TitleMediumWeight", "t0", "TitleSmallFont", "u0", "TitleSmallLineHeight", "v0", "TitleSmallSize", "w0", "TitleSmallTracking", "x0", "TitleSmallWeight", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final j0 DisplaySmallFont;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final long DisplaySmallLineHeight;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final long DisplaySmallSize;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final long DisplaySmallTracking;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final FontWeight DisplaySmallWeight;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final j0 HeadlineLargeFont;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final long HeadlineLargeLineHeight;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final long HeadlineLargeSize;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final long HeadlineLargeTracking;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final FontWeight HeadlineLargeWeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final j0 HeadlineMediumFont;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final long HeadlineMediumLineHeight;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final long HeadlineMediumSize;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final long HeadlineMediumTracking;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final FontWeight HeadlineMediumWeight;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final j0 HeadlineSmallFont;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final long HeadlineSmallLineHeight;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final long HeadlineSmallSize;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final long HeadlineSmallTracking;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final FontWeight HeadlineSmallWeight;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final j0 LabelLargeFont;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final long LabelLargeLineHeight;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final long LabelLargeSize;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final long LabelLargeTracking;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final FontWeight LabelLargeWeight;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final j0 LabelMediumFont;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f104591a = new m();

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final long LabelMediumLineHeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final j0 BodyLargeFont;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final long LabelMediumSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long BodyLargeLineHeight;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final long LabelMediumTracking;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long BodyLargeSize;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight LabelMediumWeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long BodyLargeTracking;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final j0 LabelSmallFont;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight BodyLargeWeight;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final long LabelSmallLineHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final j0 BodyMediumFont;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final long LabelSmallSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long BodyMediumLineHeight;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private static final long LabelSmallTracking;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long BodyMediumSize;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight LabelSmallWeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long BodyMediumTracking;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private static final j0 TitleLargeFont;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight BodyMediumWeight;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleLargeLineHeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final j0 BodySmallFont;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleLargeSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long BodySmallLineHeight;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleLargeTracking;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long BodySmallSize;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight TitleLargeWeight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long BodySmallTracking;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private static final j0 TitleMediumFont;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight BodySmallWeight;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleMediumLineHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final j0 DisplayLargeFont;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleMediumSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long DisplayLargeLineHeight;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleMediumTracking;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long DisplayLargeSize;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight TitleMediumWeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long DisplayLargeTracking;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private static final j0 TitleSmallFont;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight DisplayLargeWeight;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleSmallLineHeight;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final j0 DisplayMediumFont;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleSmallSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long DisplayMediumLineHeight;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private static final long TitleSmallTracking;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long DisplayMediumSize;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight TitleSmallWeight;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long DisplayMediumTracking;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight DisplayMediumWeight;

    static {
        n nVar = n.f104641a;
        BodyLargeFont = nVar.b();
        BodyLargeLineHeight = w.f(24.0d);
        BodyLargeSize = w.h(16);
        BodyLargeTracking = w.f(0.5d);
        BodyLargeWeight = nVar.d();
        BodyMediumFont = nVar.b();
        BodyMediumLineHeight = w.f(20.0d);
        BodyMediumSize = w.h(14);
        BodyMediumTracking = w.f(0.2d);
        BodyMediumWeight = nVar.d();
        BodySmallFont = nVar.b();
        BodySmallLineHeight = w.f(16.0d);
        BodySmallSize = w.h(12);
        BodySmallTracking = w.f(0.4d);
        BodySmallWeight = nVar.d();
        DisplayLargeFont = nVar.a();
        DisplayLargeLineHeight = w.f(64.0d);
        DisplayLargeSize = w.h(57);
        long jF = w.f(0.2d);
        w.b(jF);
        DisplayLargeTracking = w.k(v.f(jF), -v.h(jF));
        DisplayLargeWeight = nVar.d();
        DisplayMediumFont = nVar.a();
        DisplayMediumLineHeight = w.f(52.0d);
        DisplayMediumSize = w.h(45);
        DisplayMediumTracking = w.f(0.0d);
        DisplayMediumWeight = nVar.d();
        DisplaySmallFont = nVar.a();
        DisplaySmallLineHeight = w.f(44.0d);
        DisplaySmallSize = w.h(36);
        DisplaySmallTracking = w.f(0.0d);
        DisplaySmallWeight = nVar.d();
        HeadlineLargeFont = nVar.a();
        HeadlineLargeLineHeight = w.f(40.0d);
        HeadlineLargeSize = w.h(32);
        HeadlineLargeTracking = w.f(0.0d);
        HeadlineLargeWeight = nVar.d();
        HeadlineMediumFont = nVar.a();
        HeadlineMediumLineHeight = w.f(36.0d);
        HeadlineMediumSize = w.h(28);
        HeadlineMediumTracking = w.f(0.0d);
        HeadlineMediumWeight = nVar.d();
        HeadlineSmallFont = nVar.a();
        HeadlineSmallLineHeight = w.f(32.0d);
        HeadlineSmallSize = w.h(24);
        HeadlineSmallTracking = w.f(0.0d);
        HeadlineSmallWeight = nVar.d();
        LabelLargeFont = nVar.b();
        LabelLargeLineHeight = w.f(20.0d);
        LabelLargeSize = w.h(14);
        LabelLargeTracking = w.f(0.1d);
        LabelLargeWeight = nVar.c();
        LabelMediumFont = nVar.b();
        LabelMediumLineHeight = w.f(16.0d);
        LabelMediumSize = w.h(12);
        LabelMediumTracking = w.f(0.5d);
        LabelMediumWeight = nVar.c();
        LabelSmallFont = nVar.b();
        LabelSmallLineHeight = w.f(16.0d);
        LabelSmallSize = w.h(11);
        LabelSmallTracking = w.f(0.5d);
        LabelSmallWeight = nVar.c();
        TitleLargeFont = nVar.a();
        TitleLargeLineHeight = w.f(28.0d);
        TitleLargeSize = w.h(22);
        TitleLargeTracking = w.f(0.0d);
        TitleLargeWeight = nVar.d();
        TitleMediumFont = nVar.b();
        TitleMediumLineHeight = w.f(24.0d);
        TitleMediumSize = w.h(16);
        TitleMediumTracking = w.f(0.2d);
        TitleMediumWeight = nVar.c();
        TitleSmallFont = nVar.b();
        TitleSmallLineHeight = w.f(20.0d);
        TitleSmallSize = w.h(14);
        TitleSmallTracking = w.f(0.1d);
        TitleSmallWeight = nVar.c();
    }

    private m() {
    }

    public final long A() {
        return DisplaySmallLineHeight;
    }

    public final long B() {
        return DisplaySmallSize;
    }

    public final long C() {
        return DisplaySmallTracking;
    }

    public final FontWeight D() {
        return DisplaySmallWeight;
    }

    public final j0 E() {
        return HeadlineLargeFont;
    }

    public final long F() {
        return HeadlineLargeLineHeight;
    }

    public final long G() {
        return HeadlineLargeSize;
    }

    public final long H() {
        return HeadlineLargeTracking;
    }

    public final FontWeight I() {
        return HeadlineLargeWeight;
    }

    public final j0 J() {
        return HeadlineMediumFont;
    }

    public final long K() {
        return HeadlineMediumLineHeight;
    }

    public final long L() {
        return HeadlineMediumSize;
    }

    public final long M() {
        return HeadlineMediumTracking;
    }

    public final FontWeight N() {
        return HeadlineMediumWeight;
    }

    public final j0 O() {
        return HeadlineSmallFont;
    }

    public final long P() {
        return HeadlineSmallLineHeight;
    }

    public final long Q() {
        return HeadlineSmallSize;
    }

    public final long R() {
        return HeadlineSmallTracking;
    }

    public final FontWeight S() {
        return HeadlineSmallWeight;
    }

    public final j0 T() {
        return LabelLargeFont;
    }

    public final long U() {
        return LabelLargeLineHeight;
    }

    public final long V() {
        return LabelLargeSize;
    }

    public final long W() {
        return LabelLargeTracking;
    }

    public final FontWeight X() {
        return LabelLargeWeight;
    }

    public final j0 Y() {
        return LabelMediumFont;
    }

    public final long Z() {
        return LabelMediumLineHeight;
    }

    public final j0 a() {
        return BodyLargeFont;
    }

    public final long a0() {
        return LabelMediumSize;
    }

    public final long b() {
        return BodyLargeLineHeight;
    }

    public final long b0() {
        return LabelMediumTracking;
    }

    public final long c() {
        return BodyLargeSize;
    }

    public final FontWeight c0() {
        return LabelMediumWeight;
    }

    public final long d() {
        return BodyLargeTracking;
    }

    public final j0 d0() {
        return LabelSmallFont;
    }

    public final FontWeight e() {
        return BodyLargeWeight;
    }

    public final long e0() {
        return LabelSmallLineHeight;
    }

    public final j0 f() {
        return BodyMediumFont;
    }

    public final long f0() {
        return LabelSmallSize;
    }

    public final long g() {
        return BodyMediumLineHeight;
    }

    public final long g0() {
        return LabelSmallTracking;
    }

    public final long h() {
        return BodyMediumSize;
    }

    public final FontWeight h0() {
        return LabelSmallWeight;
    }

    public final long i() {
        return BodyMediumTracking;
    }

    public final j0 i0() {
        return TitleLargeFont;
    }

    public final FontWeight j() {
        return BodyMediumWeight;
    }

    public final long j0() {
        return TitleLargeLineHeight;
    }

    public final j0 k() {
        return BodySmallFont;
    }

    public final long k0() {
        return TitleLargeSize;
    }

    public final long l() {
        return BodySmallLineHeight;
    }

    public final long l0() {
        return TitleLargeTracking;
    }

    public final long m() {
        return BodySmallSize;
    }

    public final FontWeight m0() {
        return TitleLargeWeight;
    }

    public final long n() {
        return BodySmallTracking;
    }

    public final j0 n0() {
        return TitleMediumFont;
    }

    public final FontWeight o() {
        return BodySmallWeight;
    }

    public final long o0() {
        return TitleMediumLineHeight;
    }

    public final j0 p() {
        return DisplayLargeFont;
    }

    public final long p0() {
        return TitleMediumSize;
    }

    public final long q() {
        return DisplayLargeLineHeight;
    }

    public final long q0() {
        return TitleMediumTracking;
    }

    public final long r() {
        return DisplayLargeSize;
    }

    public final FontWeight r0() {
        return TitleMediumWeight;
    }

    public final long s() {
        return DisplayLargeTracking;
    }

    public final j0 s0() {
        return TitleSmallFont;
    }

    public final FontWeight t() {
        return DisplayLargeWeight;
    }

    public final long t0() {
        return TitleSmallLineHeight;
    }

    public final j0 u() {
        return DisplayMediumFont;
    }

    public final long u0() {
        return TitleSmallSize;
    }

    public final long v() {
        return DisplayMediumLineHeight;
    }

    public final long v0() {
        return TitleSmallTracking;
    }

    public final long w() {
        return DisplayMediumSize;
    }

    public final FontWeight w0() {
        return TitleSmallWeight;
    }

    public final long x() {
        return DisplayMediumTracking;
    }

    public final FontWeight y() {
        return DisplayMediumWeight;
    }

    public final j0 z() {
        return DisplaySmallFont;
    }
}
