package net.time4j.calendar;

import com.tesla.TeslaV4.BuildConfig;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.engine.f0;
import net.time4j.engine.l0;
import net.time4j.engine.v;
import net.time4j.engine.y;
import net.time4j.format.t;
import net.time4j.g0;
import net.time4j.x0;
import net.time4j.z0;

/* JADX INFO: loaded from: classes9.dex */
@net.time4j.format.c("dangi")
public final class KoreanCalendar extends net.time4j.calendar.f<e, KoreanCalendar> implements net.time4j.format.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f93980g = {4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 4295, 3, 4297, 7, 4300, 6, 4303, 4, 4306, 2, 4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 4363, 2, 4365, 7, 4368, 5, 4371, 3, 4373, 9, 4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 4390, 4, BuildConfig.VERSION_CODE, 9, 4395, 6, 4398, 5, 4401, 2, 4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 4417, 5, 4420, 3, 4422, 7, 4425, 6, 4428, 4, 4431, 2, 4433, 6, 4436, 4, 4439, 3, 4441, 6, 4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 11, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4525, 12, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 3, 4650, 9, 4653, 5, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 3, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 9, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 4, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 7, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 8, 4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4955, 2, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 2, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 6, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 8, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 5, 5153, 4, 5156, 2, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 5177, 7, 5180, 5, 5183, 3, 5185, 8, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 5204, 8, 5207, 6, 5210, 4, 5212, 8, 5215, 7, 5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 5, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 8, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5345, 10, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 1, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 11, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 4, 5633, 9, 5636, 6
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final net.time4j.engine.p<k> f93981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final net.time4j.engine.p<Integer> f93982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final net.time4j.engine.p<Integer> f93983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t<net.time4j.calendar.c> f93984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final net.time4j.engine.p<p> f93985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t<h> f93986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q<Integer, KoreanCalendar> f93987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q<Integer, KoreanCalendar> f93988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q<Integer, KoreanCalendar> f93989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q<x0, KoreanCalendar> f93990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final r<KoreanCalendar> f93991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l<KoreanCalendar> f93992s;
    private static final long serialVersionUID = -4284841131270593971L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final net.time4j.calendar.d<KoreanCalendar> f93993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final f0<e, KoreanCalendar> f93994u;

    private static class SPX implements Externalizable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f93995a;

        public SPX() {
        }

        private KoreanCalendar a(ObjectInput objectInput) throws IOException {
            byte b11 = objectInput.readByte();
            byte b12 = objectInput.readByte();
            byte b13 = objectInput.readByte();
            boolean z11 = objectInput.readBoolean();
            byte b14 = objectInput.readByte();
            h hVarD = h.d(b13);
            if (z11) {
                hVarD = hVarD.e();
            }
            return KoreanCalendar.k0(b11, b12, hVarD, b14);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            net.time4j.calendar.f fVar = (net.time4j.calendar.f) this.f93995a;
            objectOutput.writeByte(fVar.T());
            objectOutput.writeByte(fVar.e0().getNumber());
            objectOutput.writeByte(fVar.Z().getNumber());
            objectOutput.writeBoolean(fVar.Z().c());
            objectOutput.writeByte(fVar.f());
        }

        private Object readResolve() {
            return this.f93995a;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws InvalidObjectException {
            if (objectInput.readByte() != 15) {
                throw new InvalidObjectException("Unknown calendar type.");
            }
            this.f93995a = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(15);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f93995a = obj;
        }
    }

    static class a implements net.time4j.engine.s<KoreanCalendar, net.time4j.engine.k<KoreanCalendar>> {
        a() {
        }

        @Override // net.time4j.engine.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.k<KoreanCalendar> apply(KoreanCalendar koreanCalendar) {
            return KoreanCalendar.f93993t;
        }
    }

    private static class b implements y<KoreanCalendar, k> {
        private b() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public k getMaximum(KoreanCalendar koreanCalendar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public k getMinimum(KoreanCalendar koreanCalendar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public k getValue(KoreanCalendar koreanCalendar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(KoreanCalendar koreanCalendar, k kVar) {
            return kVar == k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar withValue(KoreanCalendar koreanCalendar, k kVar, boolean z11) {
            if (isValid(koreanCalendar, kVar)) {
                return koreanCalendar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + kVar);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static class c extends net.time4j.calendar.a<KoreanCalendar> {
        c() {
            super(KoreanCalendar.class);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0036  */
        /* JADX WARN: Code duplicated, block: B:12:0x003b  */
        /* JADX WARN: Code duplicated, block: B:9:0x002a  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar b(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            j jVarB;
            int iP;
            int iP2 = qVar.p(net.time4j.calendar.b.f94034a);
            if (iP2 == Integer.MIN_VALUE) {
                t<net.time4j.calendar.c> tVar = KoreanCalendar.f93984k;
                if (qVar.n(tVar)) {
                    net.time4j.engine.p<Integer> pVar = KoreanCalendar.f93982i;
                    if (qVar.n(pVar)) {
                        jVarB = ((net.time4j.calendar.c) qVar.s(tVar)).m(qVar.p(pVar));
                    } else {
                        iP = qVar.p(k.DANGI.yearOfEra());
                        if (iP != Integer.MIN_VALUE) {
                            jVarB = j.a(iP);
                        } else {
                            jVarB = null;
                        }
                    }
                } else {
                    iP = qVar.p(k.DANGI.yearOfEra());
                    if (iP != Integer.MIN_VALUE) {
                        jVarB = j.a(iP);
                    } else {
                        jVarB = null;
                    }
                }
            } else {
                jVarB = j.b(iP2);
            }
            if (jVarB == null) {
                qVar.B(l0.ERROR_MESSAGE, "Cannot determine East Asian year.");
                return null;
            }
            t<h> tVar2 = KoreanCalendar.f93986m;
            if (qVar.n(tVar2)) {
                h hVar = (h) qVar.s(tVar2);
                int iP3 = qVar.p(KoreanCalendar.f93988o);
                if (iP3 != Integer.MIN_VALUE) {
                    return KoreanCalendar.l0(jVarB, hVar, iP3);
                }
            } else {
                int iP4 = qVar.p(KoreanCalendar.f93989p);
                if (iP4 != Integer.MIN_VALUE && iP4 >= 1) {
                    return (KoreanCalendar) KoreanCalendar.l0(jVarB, h.d(1), 1).H(iP4 - 1, e.DAYS);
                }
            }
            return null;
        }
    }

    private static class d extends net.time4j.calendar.d<KoreanCalendar> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final List<net.time4j.tz.p> f93996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f93997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f93998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f93999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f94000h;

        static {
            ArrayList arrayList = new ArrayList(5);
            net.time4j.tz.f fVar = net.time4j.tz.f.AHEAD_OF_UTC;
            arrayList.add(net.time4j.tz.p.c(fVar, 126, 58, 0.0d));
            arrayList.add(net.time4j.tz.p.o(fVar, 8, 30));
            arrayList.add(net.time4j.tz.p.o(fVar, 9, 0));
            arrayList.add(net.time4j.tz.p.o(fVar, 8, 30));
            arrayList.add(net.time4j.tz.p.o(fVar, 9, 0));
            f93996d = Collections.unmodifiableList(arrayList);
            f93997e = g0.I0(1908, 4, 1).h();
            f93998f = g0.I0(1912, 1, 1).h();
            f93999g = g0.I0(1954, 3, 21).h();
            f94000h = g0.I0(1961, 8, 10).h();
        }

        private d() {
        }

        @Override // net.time4j.calendar.d
        int[] g() {
            return KoreanCalendar.f93980g;
        }

        @Override // net.time4j.calendar.d
        net.time4j.tz.p h(long j11) {
            if (j11 < f93997e) {
                return f93996d.get(0);
            }
            if (j11 < f93998f) {
                return f93996d.get(1);
            }
            if (j11 < f93999g) {
                return f93996d.get(2);
            }
            return j11 < f94000h ? f93996d.get(3) : f93996d.get(4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.calendar.d
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar d(int i11, int i12, h hVar, int i13, long j11) {
            return new KoreanCalendar(i11, i12, hVar, i13, j11, null);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public enum e implements v {
        CYCLES(1.893415507776E9d),
        YEARS(3.15569251296E7d),
        MONTHS(2551442.8775903997d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        e(double d11) {
            this.length = d11;
        }

        public int between(KoreanCalendar koreanCalendar, KoreanCalendar koreanCalendar2) {
            return (int) koreanCalendar.I(koreanCalendar2, this);
        }

        @Override // net.time4j.engine.v
        public double getLength() {
            return this.length;
        }

        @Override // net.time4j.engine.v
        public boolean isCalendrical() {
            return true;
        }
    }

    private static class f implements y<KoreanCalendar, Integer> {
        private f() {
        }

        private int e(KoreanCalendar koreanCalendar) {
            return ((koreanCalendar.T() * 60) + koreanCalendar.e0().getNumber()) - 364;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(KoreanCalendar koreanCalendar) {
            return 5332;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(KoreanCalendar koreanCalendar) {
            return 3978;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(KoreanCalendar koreanCalendar) {
            return Integer.valueOf(e(koreanCalendar));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(KoreanCalendar koreanCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= getMinimum(koreanCalendar).intValue() && num.intValue() <= getMaximum(koreanCalendar).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar withValue(KoreanCalendar koreanCalendar, Integer num, boolean z11) {
            if (num == null) {
                throw new IllegalArgumentException("Missing year of era.");
            }
            if (isValid(koreanCalendar, num)) {
                return (KoreanCalendar) koreanCalendar.H(num.intValue() - e(koreanCalendar), e.YEARS);
            }
            throw new IllegalArgumentException("Invalid year of era: " + num);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    static {
        k kVar = k.DANGI;
        net.time4j.engine.p<k> pVarEra = kVar.era();
        f93981h = pVarEra;
        net.time4j.calendar.service.f fVar = new net.time4j.calendar.service.f("CYCLE", KoreanCalendar.class, 72, 94, (char) 0, null, null);
        f93982i = fVar;
        net.time4j.engine.p<Integer> pVarYearOfEra = kVar.yearOfEra();
        f93983j = pVarYearOfEra;
        net.time4j.calendar.e eVar = net.time4j.calendar.e.f94048a;
        f93984k = eVar;
        i iVarM = i.m();
        f93985l = iVarM;
        g gVar = g.f94061a;
        f93986m = gVar;
        net.time4j.calendar.service.f fVar2 = new net.time4j.calendar.service.f("MONTH_AS_ORDINAL", KoreanCalendar.class, 1, 12, (char) 0, null, null);
        f93987n = fVar2;
        net.time4j.calendar.service.f fVar3 = new net.time4j.calendar.service.f("DAY_OF_MONTH", KoreanCalendar.class, 1, 30, 'd');
        f93988o = fVar3;
        net.time4j.calendar.service.f fVar4 = new net.time4j.calendar.service.f("DAY_OF_YEAR", KoreanCalendar.class, 1, 355, 'D');
        f93989p = fVar4;
        net.time4j.calendar.service.g gVar2 = new net.time4j.calendar.service.g(KoreanCalendar.class, j0());
        f93990q = gVar2;
        r<KoreanCalendar> rVar = new r<>(KoreanCalendar.class, fVar3, gVar2);
        f93991r = rVar;
        f93992s = rVar;
        a aVar = null;
        d dVar = new d(aVar);
        f93993t = dVar;
        f0.b bVarD = f0.b.j(e.class, KoreanCalendar.class, new c(), dVar).d(pVarEra, new b(aVar)).d(fVar, net.time4j.calendar.f.U(eVar));
        f fVar5 = new f(aVar);
        e eVar2 = e.YEARS;
        f0.b bVarD2 = bVarD.e(pVarYearOfEra, fVar5, eVar2).e(eVar, net.time4j.calendar.f.f0(gVar), eVar2).d(iVarM, i.m());
        y yVarB0 = net.time4j.calendar.f.b0(fVar3);
        e eVar3 = e.MONTHS;
        f0.b bVarE = bVarD2.e(gVar, yVarB0, eVar3).e(fVar2, net.time4j.calendar.f.a0(fVar3), eVar3);
        y yVarV = net.time4j.calendar.f.V();
        e eVar4 = e.DAYS;
        f0.b bVarD3 = bVarE.e(fVar3, yVarV, eVar4).e(fVar4, net.time4j.calendar.f.X(), eVar4).e(gVar2, new s(j0(), new a()), eVar4).d(rVar, r.t(rVar)).d(net.time4j.calendar.b.f94034a, new n(dVar, fVar4));
        e eVar5 = e.CYCLES;
        f0.b bVarG = bVarD3.g(eVar5, net.time4j.calendar.f.d0(0), eVar5.getLength(), Collections.singleton(eVar2)).g(eVar2, net.time4j.calendar.f.d0(1), eVar2.getLength(), Collections.singleton(eVar5)).g(eVar3, net.time4j.calendar.f.d0(2), eVar3.getLength(), Collections.EMPTY_SET);
        e eVar6 = e.WEEKS;
        f93994u = bVarG.g(eVar6, net.time4j.calendar.f.d0(3), eVar6.getLength(), Collections.singleton(eVar4)).g(eVar4, net.time4j.calendar.f.d0(4), eVar4.getLength(), Collections.singleton(eVar6)).f(new net.time4j.calendar.b.g(KoreanCalendar.class, fVar3, fVar4, j0())).h();
    }

    /* synthetic */ KoreanCalendar(int i11, int i12, h hVar, int i13, long j11, a aVar) {
        this(i11, i12, hVar, i13, j11);
    }

    public static z0 j0() {
        return z0.j(new Locale("ko", "KR"));
    }

    static KoreanCalendar k0(int i11, int i12, h hVar, int i13) {
        return new KoreanCalendar(i11, i12, hVar, i13, f93993t.s(i11, i12, hVar, i13));
    }

    public static KoreanCalendar l0(j jVar, h hVar, int i11) {
        return k0(jVar.c(), jVar.e().getNumber(), hVar, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* JADX INFO: renamed from: E */
    public f0<e, KoreanCalendar> t() {
        return f93994u;
    }

    @Override // net.time4j.calendar.f
    net.time4j.calendar.d<KoreanCalendar> S() {
        return f93993t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public KoreanCalendar u() {
        return this;
    }

    private KoreanCalendar(int i11, int i12, h hVar, int i13, long j11) {
        super(i11, i12, hVar, i13, j11);
    }
}
