package org.bouncycastle.pqc.crypto.falcon;

import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import org.spongycastle.crypto.tls.AlertDescription;

/* JADX INFO: loaded from: classes10.dex */
class FalconKeyGen {
    private short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, AlertDescription.unrecognized_name, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, AlertDescription.bad_certificate_hash_value, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, AlertDescription.unsupported_extension, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, AlertDescription.bad_certificate_status_response, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, AlertDescription.unknown_psk_identity, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, AlertDescription.certificate_unobtainable, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE};
    final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, 157, 308};
    final int[] bitlength_avg = {4, 11, 24, 50, 102, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, HttpStatusCode.UNAUTHORIZED_401, 794, 1577, 3138, 6308};
    final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};
    final int DEPTH_INT_FG = 4;
    FPREngine fpr = new FPREngine();
    FalconSmallPrimeList primes = new FalconSmallPrimeList();
    FalconFFT fft = new FalconFFT();
    FalconCodec codec = new FalconCodec();
    FalconVrfy vrfy = new FalconVrfy();

    FalconKeyGen() {
    }

    private static int mkn(int i11) {
        return 1 << i11;
    }

    private long toUnsignedLong(int i11) {
        return ((long) i11) & 4294967295L;
    }

    long get_rng_u64(SHAKE256 shake256) {
        byte[] bArr = new byte[8];
        shake256.inner_shake256_extract(bArr, 0, 8);
        return ((((long) bArr[7]) & 255) << 56) | (((long) bArr[0]) & 255) | ((((long) bArr[1]) & 255) << 8) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[6]) & 255) << 48);
    }

    void keygen(SHAKE256 shake256, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, byte[] bArr4, int i14, short[] sArr, int i15, int i16) {
        FalconKeyGen falconKeyGen;
        int i17;
        int i18;
        short[] sArr2;
        int i19;
        int i21;
        byte b11;
        FalconKeyGen falconKeyGen2 = this;
        bArr = bArr;
        i11 = i11;
        bArr2 = bArr2;
        i12 = i12;
        int i22 = i16;
        int iMkn = mkn(i22);
        short[] sArr3 = sArr;
        while (true) {
            FalconFPR[] falconFPRArr = new FalconFPR[iMkn * 3];
            falconKeyGen2.poly_small_mkgauss(shake256, bArr, i11, i22);
            falconKeyGen2.poly_small_mkgauss(shake256, bArr2, i12, i22);
            int i23 = 1 << (falconKeyGen2.codec.max_fg_bits[i22] - 1);
            for (int i24 = 0; i24 < iMkn; i24++) {
                byte b12 = bArr[i11 + i24];
                if (b12 >= i23 || b12 <= (i21 = -i23) || (b11 = bArr2[i12 + i24]) >= i23 || b11 <= i21) {
                    i23 = -1;
                    break;
                }
            }
            if (i23 >= 0) {
                int iPoly_small_sqnorm = falconKeyGen2.poly_small_sqnorm(bArr, i11, i22);
                int iPoly_small_sqnorm2 = falconKeyGen2.poly_small_sqnorm(bArr2, i12, i22);
                if ((((long) ((-((iPoly_small_sqnorm | iPoly_small_sqnorm2) >>> 31)) | (iPoly_small_sqnorm + iPoly_small_sqnorm2))) & 4294967295L) < 16823) {
                    int i25 = iMkn + iMkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, 0, bArr, i11, i22);
                    int i26 = iMkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, i26, bArr2, i12, i22);
                    falconKeyGen = falconKeyGen2;
                    falconKeyGen.fft.FFT(falconFPRArr, 0, i22);
                    falconKeyGen.fft.FFT(falconFPRArr, i26, i22);
                    falconKeyGen.fft.poly_invnorm2_fft(falconFPRArr, i25, falconFPRArr, 0, falconFPRArr, i26, i16);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, 0, i16);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, i26, i16);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, 0, falconKeyGen.fpr.fpr_q, i16);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, i26, falconKeyGen.fpr.fpr_q, i16);
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, 0, falconFPRArr, i25, i16);
                    i22 = i16;
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, i26, falconFPRArr, i25, i22);
                    i17 = i26;
                    falconKeyGen.fft.iFFT(falconFPRArr, 0, i22);
                    falconKeyGen.fft.iFFT(falconFPRArr, i17, i22);
                    FalconFPR falconFPRFpr_add = falconKeyGen.fpr.fpr_zero;
                    for (int i27 = 0; i27 < i17; i27++) {
                        FPREngine fPREngine = falconKeyGen.fpr;
                        FalconFPR falconFPRFpr_add2 = fPREngine.fpr_add(falconFPRFpr_add, fPREngine.fpr_sqr(falconFPRArr[i27]));
                        FPREngine fPREngine2 = falconKeyGen.fpr;
                        falconFPRFpr_add = fPREngine2.fpr_add(falconFPRFpr_add2, fPREngine2.fpr_sqr(falconFPRArr[i17 + i27]));
                    }
                    FPREngine fPREngine3 = falconKeyGen.fpr;
                    if (fPREngine3.fpr_lt(falconFPRFpr_add, fPREngine3.fpr_bnorm_max)) {
                        short[] sArr4 = new short[i17 * 2];
                        if (sArr3 == null) {
                            sArr2 = sArr4;
                            i18 = 0;
                            i19 = i17;
                        } else {
                            i18 = i15;
                            sArr2 = sArr3;
                            i19 = 0;
                        }
                        short[] sArr5 = sArr2;
                        if (falconKeyGen.vrfy.compute_public(sArr2, i18, bArr, i11, bArr2, i12, i22, sArr4, i19) != 0) {
                            if (falconKeyGen.solve_NTRU(i22, bArr3, i13, bArr4, i14, bArr, i11, bArr2, i12, (1 << (falconKeyGen.codec.max_FG_bits[i22] - 1)) - 1, new int[i22 > 2 ? i17 * 28 : i17 * 84], 0) != 0) {
                                return;
                            }
                        }
                        falconKeyGen2 = this;
                        i22 = i16;
                        iMkn = i17;
                        sArr3 = sArr5;
                    } else {
                        falconKeyGen2 = falconKeyGen;
                        iMkn = i17;
                    }
                }
            }
            falconKeyGen = falconKeyGen2;
            i17 = iMkn;
            falconKeyGen2 = falconKeyGen;
            iMkn = i17;
        }
    }

    void make_fg(int[] iArr, int i11, byte[] bArr, int i12, byte[] bArr2, int i13, int i14, int i15, int i16) {
        int iMkn = mkn(i14);
        int i17 = i11 + iMkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i18 = falconSmallPrimeArr[0].f99063p;
        for (int i19 = 0; i19 < iMkn; i19++) {
            iArr[i11 + i19] = modp_set(bArr[i12 + i19], i18);
            iArr[i17 + i19] = modp_set(bArr2[i13 + i19], i18);
        }
        if (i15 != 0 || i16 == 0) {
            int i21 = 0;
            while (i21 < i15) {
                int i22 = i21 + 1;
                make_fg_step(iArr, i11, i14 - i21, i21, i21 != 0 ? 1 : 0, (i22 < i15 || i16 != 0) ? 1 : 0);
                i21 = i22;
            }
            return;
        }
        int i23 = falconSmallPrimeArr[0].f99063p;
        int iModp_ninv31 = modp_ninv31(i23);
        int i24 = i17 + iMkn;
        modp_mkgm2(iArr, i24, iArr, iMkn + i24, i14, falconSmallPrimeArr[0].f99062g, i23, iModp_ninv31);
        modp_NTT2(iArr, i11, iArr, i24, i14, i23, iModp_ninv31);
        modp_NTT2(iArr, i17, iArr, i24, i14, i23, iModp_ninv31);
    }

    void make_fg_step(int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        FalconKeyGen falconKeyGen;
        int i21;
        int i22;
        FalconKeyGen falconKeyGen2;
        int i23;
        int i24;
        FalconKeyGen falconKeyGen3 = this;
        int[] iArr2 = iArr;
        boolean z11 = true;
        int i25 = 1 << i12;
        int i26 = i25 >> 1;
        int[] iArr3 = falconKeyGen3.MAX_BL_SMALL;
        int i27 = iArr3[i13];
        int i28 = iArr3[i13 + 1];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i29 = i26 * i28;
        int i31 = i11 + i29;
        int i32 = i31 + i29;
        int i33 = i25 * i27;
        int i34 = i32 + i33;
        int i35 = i34 + i33;
        int i36 = i35 + i25;
        int i37 = i36 + i25;
        System.arraycopy(iArr2, i11, iArr2, i32, i25 * 2 * i27);
        int i38 = 0;
        while (i38 < i27) {
            int i39 = falconSmallPrimeArr[i38].f99063p;
            int iModp_ninv31 = falconKeyGen3.modp_ninv31(i39);
            int iModp_R2 = falconKeyGen3.modp_R2(i39, iModp_ninv31);
            boolean z12 = z11;
            int i41 = i38;
            int i42 = i32;
            int i43 = i35;
            int i44 = i36;
            falconKeyGen3.modp_mkgm2(iArr2, i43, iArr, i44, i12, falconSmallPrimeArr[i38].f99062g, i39, iModp_ninv31);
            int i45 = i42 + i41;
            int i46 = 0;
            int i47 = i45;
            while (i46 < i25) {
                iArr[i37 + i46] = iArr[i47];
                i46++;
                i47 += i27;
            }
            if (i14 == 0) {
                int i48 = i37;
                falconKeyGen = this;
                falconKeyGen.modp_NTT2(iArr, i48, iArr, i43, i12, i39, iModp_ninv31);
                i18 = i48;
                i19 = iModp_ninv31;
                i39 = i39;
            } else {
                i18 = i37;
                i19 = iModp_ninv31;
                falconKeyGen = this;
            }
            int i49 = i11 + i41;
            int i51 = 0;
            int i52 = i49;
            while (i51 < i26) {
                int i53 = i18 + (i51 << 1);
                iArr[i52] = falconKeyGen.modp_montymul(falconKeyGen.modp_montymul(iArr[i53], iArr[i53 + 1], i39, i19), iModp_R2, i39, i19);
                i51++;
                i52 += i28;
            }
            if (i14 != 0) {
                int i54 = i27;
                falconKeyGen.modp_iNTT2_ext(iArr, i45, i54, iArr, i44, i12, i39, i19);
                i21 = i54;
            } else {
                i21 = i27;
            }
            int i55 = i34 + i41;
            int i56 = 0;
            int i57 = i55;
            while (i56 < i25) {
                iArr[i18 + i56] = iArr[i57];
                i56++;
                i57 += i21;
            }
            if (i14 == 0) {
                int i58 = i39;
                int i59 = i19;
                falconKeyGen2 = this;
                falconKeyGen2.modp_NTT2(iArr, i18, iArr, i43, i12, i58, i59);
                i22 = i59;
                i39 = i58;
            } else {
                i22 = i19;
                falconKeyGen2 = this;
            }
            int i61 = i31 + i41;
            int i62 = 0;
            int i63 = i61;
            while (i62 < i26) {
                int i64 = i18 + (i62 << 1);
                iArr[i63] = falconKeyGen2.modp_montymul(falconKeyGen2.modp_montymul(iArr[i64], iArr[i64 + 1], i39, i22), iModp_R2, i39, i22);
                i62++;
                i63 += i28;
            }
            if (i14 != 0) {
                i23 = r8;
                falconKeyGen2.modp_iNTT2_ext(iArr, i55, i21, iArr, i23, i12, i39, i22);
            } else {
                i23 = r8;
            }
            int i65 = i21;
            if (i15 == 0) {
                int i66 = i12 - 1;
                int i67 = i28;
                modp_iNTT2_ext(iArr, i49, i67, iArr, i23, i66, i39, i22);
                modp_iNTT2_ext(iArr, i61, i67, iArr, i23, i66, i39, i22);
                i24 = i67;
            } else {
                i24 = i28;
            }
            i38 = i41 + 1;
            falconKeyGen3 = this;
            iArr2 = iArr;
            i32 = i42;
            i36 = i23;
            i35 = i43;
            z11 = z12;
            i37 = i18;
            i28 = i24;
            i27 = i65;
        }
        int i68 = i27;
        int i69 = i28;
        int i71 = i37;
        int i72 = i32;
        int i73 = i35;
        int i74 = i36;
        FalconKeyGen falconKeyGen4 = this;
        falconKeyGen4.zint_rebuild_CRT(iArr, i32, i68, i68, i25, falconSmallPrimeArr, 1, iArr, i73);
        falconKeyGen4.zint_rebuild_CRT(iArr, i34, i68, i68, i25, falconSmallPrimeArr, 1, iArr, i73);
        int i75 = i73;
        int i76 = i68;
        while (i76 < i69) {
            int i77 = falconSmallPrimeArr[i76].f99063p;
            int iModp_ninv32 = falconKeyGen4.modp_ninv31(i77);
            int iModp_R3 = falconKeyGen4.modp_R2(i77, iModp_ninv32);
            int iModp_Rx = falconKeyGen4.modp_Rx(i68, i77, iModp_ninv32, iModp_R3);
            int i78 = iModp_R3;
            int i79 = i75;
            int i81 = i74;
            int i82 = i76;
            falconKeyGen4.modp_mkgm2(iArr, i79, iArr, i81, i12, falconSmallPrimeArr[i76].f99062g, i77, iModp_ninv32);
            int i83 = i72;
            int i84 = 0;
            while (i84 < i25) {
                int i85 = i77;
                int i86 = i68;
                int i87 = iModp_Rx;
                int i88 = i78;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr, i83, i86, i85, iModp_ninv32, i88, i87);
                i77 = i85;
                iArr[i71 + i84] = iZint_mod_small_signed;
                i84++;
                i83 += i86;
                i68 = i86;
                iModp_Rx = i87;
                i78 = i88;
            }
            int i89 = iModp_Rx;
            int i91 = i78;
            int i92 = i68;
            FalconKeyGen falconKeyGen5 = this;
            int i93 = i91;
            int i94 = i77;
            falconKeyGen5.modp_NTT2(iArr, i71, iArr, i79, i12, i94, iModp_ninv32);
            int i95 = i94;
            int i96 = i11 + i82;
            int i97 = i96;
            int i98 = 0;
            while (i98 < i26) {
                int i99 = i71 + (i98 << 1);
                iArr[i97] = falconKeyGen5.modp_montymul(falconKeyGen5.modp_montymul(iArr[i99], iArr[i99 + 1], i95, iModp_ninv32), i93, i95, iModp_ninv32);
                i98++;
                i97 += i69;
            }
            int i100 = i34;
            int i101 = 0;
            while (i101 < i25) {
                int i102 = i95;
                int i103 = i93;
                int i104 = i92;
                int i105 = i89;
                int iZint_mod_small_signed2 = falconKeyGen5.zint_mod_small_signed(iArr, i100, i104, i102, iModp_ninv32, i103, i105);
                i95 = i102;
                iArr[i71 + i101] = iZint_mod_small_signed2;
                i101++;
                i100 += i104;
                i93 = i103;
                i92 = i104;
                i89 = i105;
                falconKeyGen5 = this;
            }
            int i106 = i92;
            int i107 = i95;
            modp_NTT2(iArr, i71, iArr, i79, i12, i107, iModp_ninv32);
            int i108 = i31 + i82;
            int i109 = 0;
            int i110 = i108;
            while (i109 < i26) {
                int i111 = i71 + (i109 << 1);
                iArr[i110] = modp_montymul(modp_montymul(iArr[i111], iArr[i111 + 1], i107, iModp_ninv32), i93, i107, iModp_ninv32);
                i109++;
                i110 += i69;
            }
            if (i15 == 0) {
                int i112 = i12 - 1;
                i16 = i69;
                i17 = i81;
                modp_iNTT2_ext(iArr, i96, i16, iArr, i17, i112, i107, iModp_ninv32);
                modp_iNTT2_ext(iArr, i108, i16, iArr, i17, i112, i107, iModp_ninv32);
            } else {
                i16 = i69;
                i17 = i81;
            }
            i76 = i82 + 1;
            falconKeyGen4 = this;
            i69 = i16;
            i74 = i17;
            i75 = i79;
            i68 = i106;
        }
    }

    int mkgauss(SHAKE256 shake256, int i11) {
        int i12 = 1 << (10 - i11);
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            long j11 = get_rng_u64(shake256);
            int i15 = (int) (j11 >>> 63);
            int i16 = (int) (((j11 & Long.MAX_VALUE) - this.gauss_1024_12289[0]) >>> 63);
            long j12 = Long.MAX_VALUE & get_rng_u64(shake256);
            int i17 = 1;
            int i18 = 0;
            while (true) {
                long[] jArr = this.gauss_1024_12289;
                if (i17 < jArr.length) {
                    int i19 = ((int) ((j12 - jArr[i17]) >>> 63)) ^ 1;
                    i18 |= (-((i16 ^ 1) & i19)) & i17;
                    i16 |= i19;
                    i17++;
                }
            }
            i13 += ((-i15) ^ i18) + i15;
        }
        return i13;
    }

    void modp_NTT2(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        modp_NTT2_ext(iArr, i11, 1, iArr2, i12, i13, i14, i15);
    }

    void modp_NTT2_ext(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16) {
        if (i14 == 0) {
            return;
        }
        int iMkn = mkn(i14);
        int i17 = 1;
        int i18 = iMkn;
        while (i17 < iMkn) {
            int i19 = i18 >> 1;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i17) {
                int i23 = iArr2[i13 + i17 + i21];
                int i24 = i11 + (i22 * i12);
                int i25 = (i19 * i12) + i24;
                int i26 = 0;
                while (i26 < i19) {
                    int i27 = iArr[i24];
                    int iModp_montymul = modp_montymul(iArr[i25], i23, i15, i16);
                    iArr[i24] = modp_add(i27, iModp_montymul, i15);
                    iArr[i25] = modp_sub(i27, iModp_montymul, i15);
                    i26++;
                    i24 += i12;
                    i25 += i12;
                }
                i21++;
                i22 += i18;
            }
            i17 <<= 1;
            i18 = i19;
        }
    }

    int modp_R(int i11) {
        return Integer.MIN_VALUE - i11;
    }

    int modp_R2(int i11, int i12) {
        int iModp_R = modp_R(i11);
        int iModp_add = modp_add(iModp_R, iModp_R, i11);
        int iModp_montymul = modp_montymul(iModp_add, iModp_add, i11, i12);
        int iModp_montymul2 = modp_montymul(iModp_montymul, iModp_montymul, i11, i12);
        int iModp_montymul3 = modp_montymul(iModp_montymul2, iModp_montymul2, i11, i12);
        int iModp_montymul4 = modp_montymul(iModp_montymul3, iModp_montymul3, i11, i12);
        int iModp_montymul5 = modp_montymul(iModp_montymul4, iModp_montymul4, i11, i12);
        return (iModp_montymul5 + (i11 & (-(iModp_montymul5 & 1)))) >>> 1;
    }

    int modp_Rx(int i11, int i12, int i13, int i14) {
        int i15 = i11 - 1;
        int iModp_R = modp_R(i12);
        int i16 = 0;
        while (true) {
            int i17 = 1 << i16;
            if (i17 > i15) {
                return iModp_R;
            }
            if ((i17 & i15) != 0) {
                iModp_R = modp_montymul(iModp_R, i14, i12, i13);
            }
            i14 = modp_montymul(i14, i14, i12, i13);
            i16++;
        }
    }

    int modp_add(int i11, int i12, int i13) {
        int i14 = (i11 + i12) - i13;
        return i14 + ((-(i14 >>> 31)) & i13);
    }

    int modp_div(int i11, int i12, int i13, int i14, int i15) {
        int i16 = i13 - 2;
        for (int i17 = 30; i17 >= 0; i17--) {
            int iModp_montymul = modp_montymul(i15, i15, i13, i14);
            i15 = iModp_montymul ^ ((-(1 & (i16 >>> i17))) & (modp_montymul(iModp_montymul, i12, i13, i14) ^ iModp_montymul));
        }
        return modp_montymul(i11, modp_montymul(i15, 1, i13, i14), i13, i14);
    }

    void modp_iNTT2(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        modp_iNTT2_ext(iArr, i11, 1, iArr2, i12, i13, i14, i15);
    }

    void modp_iNTT2_ext(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16) {
        int i17;
        if (i14 == 0) {
            return;
        }
        int iMkn = mkn(i14);
        int i18 = 1;
        int i19 = iMkn;
        int i21 = 1;
        while (true) {
            i17 = 0;
            if (i19 <= i18) {
                break;
            }
            i19 >>= 1;
            int i22 = i21 << 1;
            int i23 = 0;
            int i24 = 0;
            while (i23 < i19) {
                int i25 = iArr2[i13 + i19 + i23];
                int i26 = i11 + (i24 * i12);
                int i27 = (i21 * i12) + i26;
                int i28 = 0;
                while (i28 < i21) {
                    int i29 = iArr[i26];
                    int i31 = i18;
                    int i32 = iArr[i27];
                    iArr[i26] = modp_add(i29, i32, i15);
                    iArr[i27] = modp_montymul(modp_sub(i29, i32, i15), i25, i15, i16);
                    i28++;
                    i26 += i12;
                    i27 += i12;
                    i18 = i31;
                }
                i23++;
                i24 += i22;
            }
            i21 = i22;
        }
        int i33 = i18 << (31 - i14);
        int i34 = i11;
        while (i17 < iMkn) {
            iArr[i34] = modp_montymul(iArr[i34], i33, i15, i16);
            i17++;
            i34 += i12;
        }
    }

    void modp_mkgm2(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, int i15, int i16) {
        int iMkn = mkn(i13);
        int iModp_R2 = modp_R2(i15, i16);
        int iModp_montymul = modp_montymul(i14, iModp_R2, i15, i16);
        for (int i17 = i13; i17 < 10; i17++) {
            iModp_montymul = modp_montymul(iModp_montymul, iModp_montymul, i15, i16);
        }
        int iModp_div = modp_div(iModp_R2, iModp_montymul, i15, i16, modp_R(i15));
        int i18 = 10 - i13;
        int iModp_R = modp_R(i15);
        int iModp_montymul2 = iModp_R;
        for (int i19 = 0; i19 < iMkn; i19++) {
            short s11 = this.REV10[i19 << i18];
            iArr[i11 + s11] = iModp_R;
            iArr2[i12 + s11] = iModp_montymul2;
            iModp_R = modp_montymul(iModp_R, iModp_montymul, i15, i16);
            iModp_montymul2 = modp_montymul(iModp_montymul2, iModp_div, i15, i16);
        }
    }

    int modp_montymul(int i11, int i12, int i13, int i14) {
        long unsignedLong = toUnsignedLong(i11) * toUnsignedLong(i12);
        int unsignedLong2 = ((int) ((unsignedLong + (((((long) i14) * unsignedLong) & toUnsignedLong(Integer.MAX_VALUE)) * ((long) i13))) >>> 31)) - i13;
        return unsignedLong2 + ((-(unsignedLong2 >>> 31)) & i13);
    }

    int modp_ninv31(int i11) {
        int i12 = 2 - i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        int i15 = i14 * (2 - (i11 * i14));
        return Integer.MAX_VALUE & (-(i15 * (2 - (i11 * i15))));
    }

    int modp_norm(int i11, int i12) {
        return i11 - (i12 & (((i11 - ((i12 + 1) >>> 1)) >>> 31) - 1));
    }

    void modp_poly_rec_res(int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 1 << (i12 - 1);
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 << 1) + i11;
            iArr[i11 + i17] = modp_montymul(modp_montymul(iArr[i18], iArr[i18 + 1], i13, i14), i15, i13, i14);
        }
    }

    int modp_set(int i11, int i12) {
        return i11 + (i12 & (-(i11 >>> 31)));
    }

    int modp_sub(int i11, int i12, int i13) {
        int i14 = i11 - i12;
        return i14 + ((-(i14 >>> 31)) & i13);
    }

    void poly_big_to_fp(FalconFPR[] falconFPRArr, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
        int iMkn = mkn(i15);
        if (i13 == 0) {
            for (int i16 = 0; i16 < iMkn; i16++) {
                falconFPRArr[i11 + i16] = this.fpr.fpr_zero;
            }
            return;
        }
        int i17 = i12;
        int i18 = 0;
        while (i18 < iMkn) {
            int i19 = -(iArr[(i17 + i13) - 1] >>> 30);
            int i21 = i19 >>> 1;
            int i22 = i19 & 1;
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_add = fPREngine.fpr_zero;
            FalconFPR falconFPRFpr_mul = fPREngine.fpr_one;
            int i23 = 0;
            while (i23 < i13) {
                int i24 = (iArr[i17 + i23] ^ i21) + i22;
                i22 = i24 >>> 31;
                int i25 = i24 & Integer.MAX_VALUE;
                FPREngine fPREngine2 = this.fpr;
                falconFPRFpr_add = fPREngine2.fpr_add(falconFPRFpr_add, fPREngine2.fpr_mul(fPREngine2.fpr_of(i25 - ((i25 << 1) & i19)), falconFPRFpr_mul));
                i23++;
                FPREngine fPREngine3 = this.fpr;
                falconFPRFpr_mul = fPREngine3.fpr_mul(falconFPRFpr_mul, fPREngine3.fpr_ptwo31);
            }
            falconFPRArr[i11 + i18] = falconFPRFpr_add;
            i18++;
            i17 += i14;
        }
    }

    int poly_big_to_small(byte[] bArr, int i11, int[] iArr, int i12, int i13, int i14) {
        int iMkn = mkn(i14);
        for (int i15 = 0; i15 < iMkn; i15++) {
            int iZint_one_to_plain = zint_one_to_plain(iArr, i12 + i15);
            if (iZint_one_to_plain < (-i13) || iZint_one_to_plain > i13) {
                return 0;
            }
            bArr[i11 + i15] = (byte) iZint_one_to_plain;
        }
        return 1;
    }

    void poly_small_mkgauss(SHAKE256 shake256, byte[] bArr, int i11, int i12) {
        int iMkgauss;
        int iMkn = mkn(i12);
        int i13 = 0;
        for (int i14 = 0; i14 < iMkn; i14++) {
            while (true) {
                iMkgauss = mkgauss(shake256, i12);
                if (iMkgauss >= -127 && iMkgauss <= 127) {
                    if (i14 == iMkn - 1) {
                        if (((iMkgauss & 1) ^ i13) != 0) {
                            break;
                        }
                    } else {
                        i13 ^= iMkgauss & 1;
                        break;
                    }
                }
            }
            bArr[i11 + i14] = (byte) iMkgauss;
        }
    }

    int poly_small_sqnorm(byte[] bArr, int i11, int i12) {
        int iMkn = mkn(i12);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iMkn; i15++) {
            byte b11 = bArr[i11 + i15];
            i13 += b11 * b11;
            i14 |= i13;
        }
        return (-(i14 >>> 31)) | i13;
    }

    void poly_small_to_fp(FalconFPR[] falconFPRArr, int i11, byte[] bArr, int i12, int i13) {
        int iMkn = mkn(i13);
        for (int i14 = 0; i14 < iMkn; i14++) {
            falconFPRArr[i11 + i14] = this.fpr.fpr_of(bArr[i12 + i14]);
        }
    }

    void poly_sub_scaled(int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14, int i15, int i16, int[] iArr3, int i17, int i18, int i19, int i21) {
        int iMkn = mkn(i21);
        for (int i22 = 0; i22 < iMkn; i22++) {
            int i23 = i14;
            int i24 = -iArr3[i17 + i22];
            int i25 = i11 + (i22 * i13);
            for (int i26 = 0; i26 < iMkn; i26++) {
                zint_add_scaled_mul_small(iArr, i25, i12, iArr2, i23, i15, i24, i18, i19);
                if (i22 + i26 == iMkn - 1) {
                    i25 = i11;
                    i24 = -i24;
                } else {
                    i25 += i13;
                }
                i23 += i16;
            }
        }
    }

    void poly_sub_scaled_ntt(int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14, int i15, int i16, int[] iArr3, int i17, int i18, int i19, int i21, int[] iArr4, int i22) {
        int i23 = i15;
        int iMkn = mkn(i21);
        int i24 = i23 + 1;
        int iMkn2 = i22 + mkn(i21);
        int iMkn3 = iMkn2 + mkn(i21);
        int i25 = iMkn3 + (iMkn * i24);
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i26 = 0;
        int i27 = 0;
        while (i27 < i24) {
            int i28 = falconSmallPrimeArr[i27].f99063p;
            int iModp_ninv31 = modp_ninv31(i28);
            int iModp_R2 = modp_R2(i28, iModp_ninv31);
            int iModp_Rx = modp_Rx(i23, i28, iModp_ninv31, iModp_R2);
            int i29 = i27;
            modp_mkgm2(iArr4, i22, iArr4, iMkn2, i21, falconSmallPrimeArr[i27].f99062g, i28, iModp_ninv31);
            int i31 = iMkn2;
            for (int i32 = 0; i32 < iMkn; i32++) {
                iArr4[i25 + i32] = modp_set(iArr3[i17 + i32], i28);
            }
            int i33 = i25;
            modp_NTT2(iArr4, i33, iArr4, i22, i21, i28, iModp_ninv31);
            int i34 = i28;
            int i35 = iMkn3 + i29;
            int i36 = i14;
            int i37 = i35;
            int i38 = 0;
            while (i38 < iMkn) {
                int i39 = i34;
                int i41 = iModp_ninv31;
                int i42 = iModp_Rx;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr2, i36, i15, i39, i41, iModp_R2, i42);
                i34 = i39;
                iArr4[i37] = iZint_mod_small_signed;
                i36 += i16;
                i37 += i24;
                iModp_Rx = i42;
                i38++;
                iModp_ninv31 = i41;
            }
            int i43 = i24;
            modp_NTT2_ext(iArr4, i35, i43, iArr4, i22, i21, i34, iModp_ninv31);
            int i44 = 0;
            while (i44 < iMkn) {
                iArr4[i35] = modp_montymul(modp_montymul(iArr4[i33 + i44], iArr4[i35], i34, iModp_ninv31), iModp_R2, i34, iModp_ninv31);
                i44++;
                i35 += i43;
            }
            modp_iNTT2_ext(iArr4, i35, i43, iArr4, i31, i21, i34, iModp_ninv31);
            i27 = i29 + 1;
            i24 = i43;
            i25 = i33;
            iMkn2 = i31;
            i23 = i15;
        }
        int i45 = i24;
        zint_rebuild_CRT(iArr4, iMkn3, i45, i45, iMkn, falconSmallPrimeArr, 1, iArr4, i25);
        int i46 = iMkn3;
        int i47 = i11;
        while (i26 < iMkn) {
            int i48 = i45;
            zint_sub_scaled(iArr, i47, i12, iArr4, i46, i48, i18, i19);
            i45 = i48;
            i26++;
            i47 += i13;
            i46 += i45;
        }
    }

    int solve_NTRU(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, byte[] bArr3, int i14, byte[] bArr4, int i15, int i16, int[] iArr, int i17) {
        byte[] bArr5;
        int i18;
        int iMkn = mkn(i11);
        if (solve_NTRU_deepest(i11, bArr3, i14, bArr4, i15, iArr, i17) == 0) {
            return 0;
        }
        int i19 = i11;
        if (i19 > 2) {
            int i21 = i11;
            while (true) {
                int i22 = i21 - 1;
                if (i21 <= 2) {
                    if (solve_NTRU_binary_depth1(i11, bArr3, i14, bArr4, i15, iArr, i17) != 0 && solve_NTRU_binary_depth0(i11, bArr3, i14, bArr4, i15, iArr, i17) != 0) {
                        break;
                    }
                    return 0;
                }
                if (solve_NTRU_intermediate(i11, bArr3, i14, bArr4, i15, i22, iArr, i17) == 0) {
                    return 0;
                }
                i21 = i22;
            }
        } else {
            int i23 = i19;
            while (true) {
                int i24 = i23 - 1;
                if (i23 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i19, bArr3, i14, bArr4, i15, i24, iArr, i17) == 0) {
                    return 0;
                }
                i19 = i11;
                i23 = i24;
            }
        }
        if (bArr2 == null) {
            bArr5 = new byte[iMkn];
            i18 = 0;
        } else {
            bArr5 = bArr2;
            i18 = i13;
        }
        if (poly_big_to_small(bArr, i12, iArr, i17, i16, i11) != 0) {
            int i25 = i17 + iMkn;
            byte[] bArr6 = bArr5;
            int i26 = i18;
            if (poly_big_to_small(bArr6, i26, iArr, i25, i16, i11) != 0) {
                int i27 = i25 + iMkn;
                int i28 = i27 + iMkn;
                int i29 = i28 + iMkn;
                FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
                int i31 = falconSmallPrimeArr[0].f99063p;
                int iModp_ninv31 = modp_ninv31(i31);
                modp_mkgm2(iArr, i29, iArr, i17, i11, falconSmallPrimeArr[0].f99062g, i31, iModp_ninv31);
                for (int i32 = 0; i32 < iMkn; i32++) {
                    iArr[i17 + i32] = modp_set(bArr6[i26 + i32], i31);
                }
                for (int i33 = 0; i33 < iMkn; i33++) {
                    iArr[i25 + i33] = modp_set(bArr3[i14 + i33], i31);
                    iArr[i27 + i33] = modp_set(bArr4[i15 + i33], i31);
                    iArr[i28 + i33] = modp_set(bArr[i12 + i33], i31);
                }
                modp_NTT2(iArr, i25, iArr, i29, i11, i31, iModp_ninv31);
                modp_NTT2(iArr, i27, iArr, i29, i11, i31, iModp_ninv31);
                modp_NTT2(iArr, i28, iArr, i29, i11, i31, iModp_ninv31);
                modp_NTT2(iArr, i17, iArr, i29, i11, i31, iModp_ninv31);
                int iModp_montymul = modp_montymul(12289, 1, i31, iModp_ninv31);
                for (int i34 = 0; i34 < iMkn; i34++) {
                    if (modp_sub(modp_montymul(iArr[i25 + i34], iArr[i17 + i34], i31, iModp_ninv31), modp_montymul(iArr[i27 + i34], iArr[i28 + i34], i31, iModp_ninv31), i31) != iModp_montymul) {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    int solve_NTRU_binary_depth0(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, int[] iArr, int i14) {
        int i15 = 1;
        int i16 = 1 << i11;
        int i17 = i16 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i18 = 0;
        int i19 = falconSmallPrimeArr[0].f99063p;
        int iModp_ninv31 = modp_ninv31(i19);
        int iModp_R2 = modp_R2(i19, iModp_ninv31);
        int i21 = i14 + i17;
        int i22 = i21 + i17;
        int i23 = i22 + i16;
        int i24 = i23 + i16;
        int i25 = i24 + i16;
        modp_mkgm2(iArr, i24, iArr, i25, i11, falconSmallPrimeArr[0].f99062g, i19, iModp_ninv31);
        for (int i26 = 0; i26 < i17; i26++) {
            int i27 = i14 + i26;
            iArr[i27] = modp_set(zint_one_to_plain(iArr, i27), i19);
            int i28 = i21 + i26;
            iArr[i28] = modp_set(zint_one_to_plain(iArr, i28), i19);
        }
        int i29 = i11 - 1;
        modp_NTT2(iArr, i14, iArr, i24, i29, i19, iModp_ninv31);
        modp_NTT2(iArr, i21, iArr, i24, i29, i19, iModp_ninv31);
        for (int i31 = 0; i31 < i16; i31++) {
            iArr[i22 + i31] = modp_set(bArr[i12 + i31], i19);
            iArr[i23 + i31] = modp_set(bArr2[i13 + i31], i19);
        }
        modp_NTT2(iArr, i22, iArr, i24, i11, i19, iModp_ninv31);
        modp_NTT2(iArr, i23, iArr, i24, i11, i19, iModp_ninv31);
        int i32 = 0;
        while (i32 < i16) {
            int i33 = i22 + i32;
            int i34 = iArr[i33];
            int i35 = i33 + 1;
            int i36 = iArr[i35];
            int i37 = i23 + i32;
            int i38 = i15;
            int i39 = iArr[i37];
            int i41 = i37 + 1;
            int i42 = i18;
            int i43 = iArr[i41];
            int i44 = i32 >> 1;
            int i45 = i32;
            int iModp_montymul = modp_montymul(iArr[i14 + i44], iModp_R2, i19, iModp_ninv31);
            int iModp_montymul2 = modp_montymul(iArr[i21 + i44], iModp_R2, i19, iModp_ninv31);
            iArr[i33] = modp_montymul(i43, iModp_montymul, i19, iModp_ninv31);
            iArr[i35] = modp_montymul(i39, iModp_montymul, i19, iModp_ninv31);
            iArr[i37] = modp_montymul(i36, iModp_montymul2, i19, iModp_ninv31);
            iArr[i41] = modp_montymul(i34, iModp_montymul2, i19, iModp_ninv31);
            i32 = i45 + 2;
            i15 = i38;
            i18 = i42;
        }
        int i46 = i15;
        int i47 = i18;
        modp_iNTT2(iArr, i22, iArr, i25, i11, i19, iModp_ninv31);
        modp_iNTT2(iArr, i23, iArr, i25, i11, i19, iModp_ninv31);
        int i48 = i14 + i16;
        int i49 = i48 + i16;
        System.arraycopy(iArr, i22, iArr, i14, i16 * 2);
        int i51 = i49 + i16;
        int i52 = i51 + i16;
        int i53 = i52 + i16;
        int i54 = i53 + i16;
        modp_mkgm2(iArr, i49, iArr, i51, i11, FalconSmallPrimeList.PRIMES[i47].f99062g, i19, iModp_ninv31);
        modp_NTT2(iArr, i14, iArr, i49, i11, i19, iModp_ninv31);
        modp_NTT2(iArr, i48, iArr, i49, i11, i19, iModp_ninv31);
        int iModp_set = modp_set(bArr[i12], i19);
        iArr[i54] = iModp_set;
        iArr[i53] = iModp_set;
        for (int i55 = i46; i55 < i16; i55++) {
            int i56 = i12 + i55;
            iArr[i53 + i55] = modp_set(bArr[i56], i19);
            iArr[(i54 + i16) - i55] = modp_set(-bArr[i56], i19);
        }
        modp_NTT2(iArr, i53, iArr, i49, i11, i19, iModp_ninv31);
        modp_NTT2(iArr, i54, iArr, i49, i11, i19, iModp_ninv31);
        for (int i57 = i47; i57 < i16; i57++) {
            int iModp_montymul3 = modp_montymul(iArr[i54 + i57], iModp_R2, i19, iModp_ninv31);
            iArr[i51 + i57] = modp_montymul(iModp_montymul3, iArr[i14 + i57], i19, iModp_ninv31);
            iArr[i52 + i57] = modp_montymul(iModp_montymul3, iArr[i53 + i57], i19, iModp_ninv31);
        }
        int iModp_set2 = modp_set(bArr2[i13], i19);
        iArr[i54] = iModp_set2;
        iArr[i53] = iModp_set2;
        for (int i58 = i46; i58 < i16; i58++) {
            int i59 = i13 + i58;
            iArr[i53 + i58] = modp_set(bArr2[i59], i19);
            iArr[(i54 + i16) - i58] = modp_set(-bArr2[i59], i19);
        }
        modp_NTT2(iArr, i53, iArr, i49, i11, i19, iModp_ninv31);
        modp_NTT2(iArr, i54, iArr, i49, i11, i19, iModp_ninv31);
        for (int i61 = i47; i61 < i16; i61++) {
            int iModp_montymul4 = modp_montymul(iArr[i54 + i61], iModp_R2, i19, iModp_ninv31);
            int i62 = i51 + i61;
            iArr[i62] = modp_add(iArr[i62], modp_montymul(iModp_montymul4, iArr[i48 + i61], i19, iModp_ninv31), i19);
            int i63 = i52 + i61;
            iArr[i63] = modp_add(iArr[i63], modp_montymul(iModp_montymul4, iArr[i53 + i61], i19, iModp_ninv31), i19);
        }
        int i64 = iModp_ninv31;
        modp_mkgm2(iArr, i49, iArr, i53, i11, FalconSmallPrimeList.PRIMES[i47].f99062g, i19, i64);
        modp_iNTT2(iArr, i51, iArr, i53, i11, i19, i64);
        modp_iNTT2(iArr, i52, iArr, i53, i11, i19, i64);
        for (int i65 = i47; i65 < i16; i65++) {
            int i66 = i51 + i65;
            iArr[i49 + i65] = modp_norm(iArr[i66], i19);
            iArr[i66] = modp_norm(iArr[i52 + i65], i19);
        }
        FalconFPR[] falconFPRArr = new FalconFPR[i16 * 3];
        int i67 = i16 + i16;
        for (int i68 = i47; i68 < i16; i68++) {
            falconFPRArr[i67 + i68] = this.fpr.fpr_of(iArr[i51 + i68]);
        }
        this.fft.FFT(falconFPRArr, i67, i11);
        System.arraycopy(falconFPRArr, i67, falconFPRArr, i16, i17);
        int i69 = i16 + i17;
        int i71 = i47;
        while (i71 < i16) {
            falconFPRArr[i69 + i71] = this.fpr.fpr_of(iArr[i49 + i71]);
            i71++;
            i48 = i48;
            i64 = i64;
        }
        int i72 = i64;
        int i73 = i48;
        this.fft.FFT(falconFPRArr, i69, i11);
        this.fft.poly_div_autoadj_fft(falconFPRArr, i69, falconFPRArr, i16, i11);
        this.fft.iFFT(falconFPRArr, i69, i11);
        for (int i74 = i47; i74 < i16; i74++) {
            iArr[i49 + i74] = modp_set((int) this.fpr.fpr_rint(falconFPRArr[i69 + i74]), i19);
        }
        modp_mkgm2(iArr, i51, iArr, i52, i11, FalconSmallPrimeList.PRIMES[i47].f99062g, i19, i72);
        for (int i75 = i47; i75 < i16; i75++) {
            iArr[i53 + i75] = modp_set(bArr[i12 + i75], i19);
            iArr[i54 + i75] = modp_set(bArr2[i13 + i75], i19);
        }
        modp_NTT2(iArr, i49, iArr, i51, i11, i19, i72);
        modp_NTT2(iArr, i53, iArr, i51, i11, i19, i72);
        modp_NTT2(iArr, i54, iArr, i51, i11, i19, i72);
        for (int i76 = i47; i76 < i16; i76++) {
            int iModp_montymul5 = modp_montymul(iArr[i49 + i76], iModp_R2, i19, i72);
            int i77 = i14 + i76;
            iArr[i77] = modp_sub(iArr[i77], modp_montymul(iModp_montymul5, iArr[i53 + i76], i19, i72), i19);
            int i78 = i73 + i76;
            iArr[i78] = modp_sub(iArr[i78], modp_montymul(iModp_montymul5, iArr[i54 + i76], i19, i72), i19);
        }
        modp_iNTT2(iArr, i14, iArr, i52, i11, i19, i72);
        modp_iNTT2(iArr, i73, iArr, i52, i11, i19, i72);
        for (int i79 = i47; i79 < i16; i79++) {
            int i81 = i14 + i79;
            iArr[i81] = modp_norm(iArr[i81], i19);
            int i82 = i73 + i79;
            iArr[i82] = modp_norm(iArr[i82], i19);
        }
        return i46;
    }

    int solve_NTRU_binary_depth1(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, int[] iArr, int i14) {
        int i15;
        FalconKeyGen falconKeyGen = this;
        int i16 = 1;
        int i17 = 1 << i11;
        int i18 = i11 - 1;
        int i19 = 1 << i18;
        int i21 = i19 >> 1;
        int[] iArr2 = falconKeyGen.MAX_BL_SMALL;
        int i22 = iArr2[1];
        int i23 = iArr2[2];
        int i24 = falconKeyGen.MAX_BL_LARGE[1];
        int i25 = i23 * i21;
        int i26 = i14 + i25;
        int i27 = i26 + i25;
        int i28 = i24 * i19;
        int i29 = i27 + i28;
        int i31 = 0;
        int i32 = 0;
        while (i32 < i24) {
            int i33 = FalconSmallPrimeList.PRIMES[i32].f99063p;
            int i34 = i31;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i33);
            int i35 = i32;
            int iModp_R2 = falconKeyGen.modp_R2(i33, iModp_ninv31);
            int i36 = i29;
            int iModp_Rx = falconKeyGen.modp_Rx(i23, i33, iModp_ninv31, iModp_R2);
            int i37 = i27 + i35;
            int i38 = i36 + i35;
            int i39 = i28;
            int i41 = i14;
            int i42 = i16;
            int i43 = i26;
            int i44 = i34;
            while (i44 < i21) {
                int i45 = i41;
                iArr[i37] = falconKeyGen.zint_mod_small_signed(iArr, i41, i23, i33, iModp_ninv31, iModp_R2, iModp_Rx);
                falconKeyGen = this;
                int i46 = i43;
                iArr[i38] = falconKeyGen.zint_mod_small_signed(iArr, i46, i23, i33, iModp_ninv31, iModp_R2, iModp_Rx);
                i37 += i24;
                i38 += i24;
                i43 = i46 + i23;
                i41 = i45 + i23;
                i36 = i36;
                i21 = i21;
                i35 = i35;
                i27 = i27;
                i44++;
                i39 = i39;
                i22 = i22;
            }
            i32 = i35 + 1;
            i27 = i27;
            i29 = i36;
            i28 = i39;
            i22 = i22;
            i21 = i21;
            i16 = i42;
            i31 = 0;
        }
        int i47 = i16;
        int i48 = i21;
        int i49 = i22;
        int i51 = i27;
        int i52 = i28;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i51, iArr3, i14, i52);
        int i53 = i14 + i52;
        System.arraycopy(iArr3, i29, iArr3, i53, i52);
        int i54 = i53 + i52;
        int i55 = i49 * i19;
        int i56 = i54 + i55;
        int i57 = i56 + i55;
        int i58 = 0;
        while (i58 < i24) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i59 = falconSmallPrimeArr[i58].f99063p;
            int iModp_ninv32 = falconKeyGen.modp_ninv31(i59);
            int iModp_R3 = falconKeyGen.modp_R2(i59, iModp_ninv32);
            int i61 = i58;
            int i62 = i57;
            int i63 = i62 + i17;
            int i64 = i63 + i19;
            int i65 = i64 + i17;
            int i66 = i24;
            falconKeyGen.modp_mkgm2(iArr3, i62, iArr, i63, i11, falconSmallPrimeArr[i61].f99062g, i59, iModp_ninv32);
            for (int i67 = 0; i67 < i17; i67++) {
                i15 = i59;
                iArr[i64 + i67] = falconKeyGen.modp_set(bArr[i12 + i67], i15);
                iArr[i65 + i67] = falconKeyGen.modp_set(bArr2[i13 + i67], i15);
            }
            i15 = i59;
            falconKeyGen.modp_NTT2(iArr, i64, iArr, i62, i11, i15, iModp_ninv32);
            modp_NTT2(iArr, i65, iArr, i62, i11, i15, iModp_ninv32);
            int i68 = i62;
            int i69 = i11;
            while (i69 > i18) {
                int i71 = i15;
                int i72 = iModp_R3;
                int i73 = i64;
                modp_poly_rec_res(iArr, i73, i69, i71, iModp_ninv32, i72);
                modp_poly_rec_res(iArr, i65, i69, i71, iModp_ninv32, i72);
                i15 = i71;
                i69--;
                i64 = i73;
                i68 = i68;
                iModp_R3 = i72;
            }
            int i74 = iModp_R3;
            int i75 = i68;
            int i76 = i75 + i19;
            System.arraycopy(iArr, i63, iArr, i76, i19);
            int i77 = i76 + i19;
            System.arraycopy(iArr, i64, iArr, i77, i19);
            int i78 = i77 + i19;
            System.arraycopy(iArr, i65, iArr, i78, i19);
            int i79 = i78 + i19;
            int i81 = i79 + i48;
            int i82 = i14 + i61;
            int i83 = i53 + i61;
            int i84 = i48;
            int i85 = i53;
            int i86 = i82;
            int i87 = i83;
            int i88 = 0;
            while (i88 < i84) {
                iArr[i79 + i88] = iArr[i86];
                iArr[i81 + i88] = iArr[i87];
                i88++;
                i86 += i66;
                i87 += i66;
            }
            int i89 = i11 - 2;
            modp_NTT2(iArr, i79, iArr, i75, i89, i15, iModp_ninv32);
            int i91 = i81;
            modp_NTT2(iArr, i91, iArr, i75, i89, i15, iModp_ninv32);
            int i92 = i82;
            int i93 = i83;
            int i94 = 0;
            while (i94 < i84) {
                int i95 = i94 << 1;
                int i96 = i77 + i95;
                int i97 = i92;
                int i98 = iArr[i96];
                int i99 = i91;
                int i100 = iArr[i96 + 1];
                int i101 = i78 + i95;
                int i102 = i93;
                int i103 = iArr[i101];
                int i104 = iArr[i101 + 1];
                int i105 = i94;
                int iModp_montymul = modp_montymul(iArr[i79 + i94], i74, i15, iModp_ninv32);
                int i106 = i17;
                int iModp_montymul2 = modp_montymul(iArr[i99 + i105], i74, i15, iModp_ninv32);
                iArr[i97] = modp_montymul(i104, iModp_montymul, i15, iModp_ninv32);
                iArr[i97 + i66] = modp_montymul(i103, iModp_montymul, i15, iModp_ninv32);
                iArr[i102] = modp_montymul(i100, iModp_montymul2, i15, iModp_ninv32);
                iArr[i102 + i66] = modp_montymul(i98, iModp_montymul2, i15, iModp_ninv32);
                i94 = i105 + 1;
                int i107 = i66 << 1;
                i93 = i102 + i107;
                i92 = i97 + i107;
                i91 = i99;
                i17 = i106;
            }
            int i108 = i17;
            int i109 = i15;
            int i110 = i18;
            modp_iNTT2_ext(iArr, i82, i66, iArr, i76, i110, i109, iModp_ninv32);
            modp_iNTT2_ext(iArr, i83, i66, iArr, i76, i110, i109, iModp_ninv32);
            int i111 = i49;
            if (i61 < i111) {
                modp_iNTT2(iArr, i77, iArr, i76, i110, i109, iModp_ninv32);
                modp_iNTT2(iArr, i78, iArr, i76, i110, i109, iModp_ninv32);
                int i112 = i54 + i61;
                int i113 = i56 + i61;
                int i114 = 0;
                while (i114 < i19) {
                    iArr[i112] = iArr[i77 + i114];
                    iArr[i113] = iArr[i78 + i114];
                    i114++;
                    i112 += i111;
                    i113 += i111;
                }
            }
            i58 = i61 + 1;
            i48 = i84;
            i53 = i85;
            falconKeyGen = this;
            iArr3 = iArr;
            i49 = i111;
            i57 = i75;
            i24 = i66;
            i18 = i110;
            i17 = i108;
        }
        int i115 = i57;
        int i116 = i24;
        int i117 = i18;
        int i118 = i49;
        int i119 = i19 << 1;
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        zint_rebuild_CRT(iArr, i14, i116, i116, i119, falconSmallPrimeArr2, 1, iArr, i115);
        zint_rebuild_CRT(iArr, i54, i118, i118, i119, falconSmallPrimeArr2, 1, iArr, i115);
        FalconFPR[] falconFPRArr = new FalconFPR[i19];
        FalconFPR[] falconFPRArr2 = new FalconFPR[i19];
        poly_big_to_fp(falconFPRArr, 0, iArr, i14, i116, i116, i117);
        poly_big_to_fp(falconFPRArr2, 0, iArr, i53, i116, i116, i117);
        System.arraycopy(iArr, i54, iArr, i14, i118 * 2 * i19);
        FalconFPR[] falconFPRArr3 = new FalconFPR[i19];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i19];
        poly_big_to_fp(falconFPRArr3, 0, iArr, i14, i118, i118, i117);
        poly_big_to_fp(falconFPRArr4, 0, iArr, i14 + i55, i118, i118, i117);
        this.fft.FFT(falconFPRArr, 0, i117);
        this.fft.FFT(falconFPRArr2, 0, i117);
        this.fft.FFT(falconFPRArr3, 0, i117);
        this.fft.FFT(falconFPRArr4, 0, i117);
        FalconFPR[] falconFPRArr5 = new FalconFPR[i19];
        FalconFPR[] falconFPRArr6 = new FalconFPR[i48];
        this.fft.poly_add_muladj_fft(falconFPRArr5, 0, falconFPRArr, 0, falconFPRArr2, 0, falconFPRArr3, 0, falconFPRArr4, 0, i117);
        this.fft.poly_invnorm2_fft(falconFPRArr6, 0, falconFPRArr3, 0, falconFPRArr4, 0, i117);
        this.fft.poly_mul_autoadj_fft(falconFPRArr5, 0, falconFPRArr6, 0, i117);
        this.fft.iFFT(falconFPRArr5, 0, i117);
        for (int i120 = 0; i120 < i19; i120++) {
            FalconFPR falconFPR = falconFPRArr5[i120];
            FPREngine fPREngine = this.fpr;
            if (!fPREngine.fpr_lt(falconFPR, fPREngine.fpr_ptwo63m1)) {
                return 0;
            }
            FPREngine fPREngine2 = this.fpr;
            if (!fPREngine2.fpr_lt(fPREngine2.fpr_mtwo63m1, falconFPR)) {
                return 0;
            }
            FPREngine fPREngine3 = this.fpr;
            falconFPRArr5[i120] = fPREngine3.fpr_of(fPREngine3.fpr_rint(falconFPR));
        }
        this.fft.FFT(falconFPRArr5, 0, i117);
        this.fft.poly_mul_fft(falconFPRArr3, 0, falconFPRArr5, 0, i117);
        this.fft.poly_mul_fft(falconFPRArr4, 0, falconFPRArr5, 0, i117);
        this.fft.poly_sub(falconFPRArr, 0, falconFPRArr3, 0, i117);
        this.fft.poly_sub(falconFPRArr2, 0, falconFPRArr4, 0, i117);
        this.fft.iFFT(falconFPRArr, 0, i117);
        this.fft.iFFT(falconFPRArr2, 0, i117);
        int i121 = i14 + i19;
        for (int i122 = 0; i122 < i19; i122++) {
            iArr[i14 + i122] = (int) this.fpr.fpr_rint(falconFPRArr[i122]);
            iArr[i121 + i122] = (int) this.fpr.fpr_rint(falconFPRArr2[i122]);
        }
        return i47;
    }

    int solve_NTRU_deepest(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, int[] iArr, int i14) {
        int i15 = this.MAX_BL_SMALL[i11];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i16 = i14 + i15;
        int i17 = i16 + i15;
        int i18 = i17 + i15;
        int i19 = i18 + i15;
        make_fg(iArr, i17, bArr, i12, bArr2, i13, i11, i11, 0);
        zint_rebuild_CRT(iArr, i17, i15, i15, 2, falconSmallPrimeArr, 0, iArr, i19);
        return (zint_bezout(iArr, i16, iArr, i14, iArr, i17, iArr, i18, i15, iArr, i19) != 0 && zint_mul_small(iArr, i14, i15, 12289) == 0 && zint_mul_small(iArr, i16, i15, 12289) == 0) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0497  */
    /* JADX WARN: Code duplicated, block: B:76:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:78:0x04af A[LOOP:11: B:77:0x04ad->B:78:0x04af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x04c4 A[LOOP:12: B:80:0x04c2->B:81:0x04c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x04dc A[LOOP:13: B:85:0x04d8->B:87:0x04dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x04ee  */
    int solve_NTRU_intermediate(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, int i14, int[] iArr, int i15) {
        FalconFPR falconFPRFpr_sqr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        FalconSmallPrime[] falconSmallPrimeArr;
        int i39;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i51;
        FalconKeyGen falconKeyGen = this;
        int i52 = i11 - i14;
        int i53 = 1 << i52;
        int i54 = i53 >> 1;
        int[] iArr3 = falconKeyGen.MAX_BL_SMALL;
        int i55 = iArr3[i14];
        int i56 = iArr3[i14 + 1];
        int i57 = falconKeyGen.MAX_BL_LARGE[i14];
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        int i58 = i56 * i54;
        int i59 = i15 + i58 + i58;
        int[] iArr4 = iArr;
        int i61 = i53;
        int i62 = i57;
        falconKeyGen.make_fg(iArr4, i59, bArr, i12, bArr2, i13, i11, i14, 1);
        int i63 = i61 * i62;
        int i64 = i15 + i63;
        int i65 = i64 + i63;
        System.arraycopy(iArr4, i59, iArr4, i65, i61 * 2 * i55);
        int i66 = i55 * i61;
        int i67 = i65 + i66;
        int i68 = i67 + i66;
        System.arraycopy(iArr4, i15, iArr4, i68, i54 * 2 * i56);
        int i69 = i68 + i58;
        int i71 = 0;
        int i72 = 0;
        while (i72 < i62) {
            int i73 = falconSmallPrimeArr2[i72].f99063p;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i73);
            int iModp_R2 = falconKeyGen.modp_R2(i73, iModp_ninv31);
            int iModp_Rx = falconKeyGen.modp_Rx(i56, i73, iModp_ninv31, iModp_R2);
            int i74 = i15 + i72;
            int i75 = i64 + i72;
            int i76 = i71;
            int i77 = i65;
            int i78 = i69;
            int i79 = i76;
            int i81 = i68;
            while (true) {
                i48 = i76;
                i49 = i72;
                i51 = i56;
                if (i79 < i54) {
                    int i82 = i81;
                    iArr[i74] = falconKeyGen.zint_mod_small_signed(iArr4, i81, i51, i73, iModp_ninv31, iModp_R2, iModp_Rx);
                    falconKeyGen = this;
                    int i83 = i78;
                    iArr[i75] = falconKeyGen.zint_mod_small_signed(iArr, i83, i51, i73, iModp_ninv31, iModp_R2, iModp_Rx);
                    i79++;
                    int i84 = i82 + i51;
                    i78 = i83 + i51;
                    i74 += i62;
                    i75 += i62;
                    i56 = i51;
                    i72 = i49;
                    i76 = i48;
                    i81 = i84;
                    iArr4 = iArr;
                }
            }
            i65 = i77;
            i71 = i48;
            i56 = i51;
            i72 = i49 + 1;
            iArr4 = iArr;
        }
        int i85 = i65;
        int i86 = i71;
        while (i86 < i62) {
            int i87 = falconSmallPrimeArr2[i86].f99063p;
            int iModp_ninv32 = falconKeyGen.modp_ninv31(i87);
            int iModp_R3 = falconKeyGen.modp_R2(i87, iModp_ninv32);
            if (i86 == i55) {
                i38 = i55;
                FalconSmallPrime[] falconSmallPrimeArr3 = falconSmallPrimeArr2;
                int i88 = i61;
                int i89 = i85;
                falconKeyGen.zint_rebuild_CRT(iArr, i89, i38, i55, i88, falconSmallPrimeArr3, 1, iArr, i68);
                i41 = i89;
                zint_rebuild_CRT(iArr, i67, i38, i38, i88, falconSmallPrimeArr3, 1, iArr, i68);
                falconSmallPrimeArr = falconSmallPrimeArr3;
                i39 = i88;
            } else {
                i38 = i55;
                falconSmallPrimeArr = falconSmallPrimeArr2;
                i39 = i61;
                i41 = i85;
            }
            int i91 = i68 + i39;
            int i92 = i91 + i39;
            int i93 = i92 + i39;
            int i94 = i68;
            int i95 = i52;
            int i96 = iModp_ninv32;
            int i97 = i38;
            int i98 = i87;
            modp_mkgm2(iArr, i94, iArr, i91, i95, falconSmallPrimeArr[i86].f99062g, i98, i96);
            if (i86 < i97) {
                int i99 = i41 + i86;
                int i100 = i67 + i86;
                int i101 = i99;
                int i102 = i100;
                int i103 = 0;
                while (i103 < i39) {
                    iArr[i92 + i103] = iArr[i101];
                    iArr[i93 + i103] = iArr[i102];
                    i103++;
                    i101 += i97;
                    i102 += i97;
                }
                modp_iNTT2_ext(iArr, i99, i97, iArr, i91, i95, i98, i96);
                modp_iNTT2_ext(iArr, i100, i97, iArr, i91, i95, i98, i96);
                i42 = i91;
                i47 = i96;
                i43 = i94;
                i44 = i92;
                i45 = i93;
                i46 = i95;
            } else {
                FalconKeyGen falconKeyGen2 = this;
                i42 = i91;
                int i104 = i98;
                int iModp_Rx2 = falconKeyGen2.modp_Rx(i97, i104, i96, iModp_R3);
                int i105 = i41;
                int i106 = i67;
                int i107 = 0;
                while (i107 < i39) {
                    int i108 = i104;
                    int i109 = i96;
                    int i110 = iModp_R3;
                    int i111 = i107;
                    int iZint_mod_small_signed = falconKeyGen2.zint_mod_small_signed(iArr, i105, i97, i108, i109, i110, iModp_Rx2);
                    int i112 = i105;
                    int i113 = iModp_Rx2;
                    iArr[i92 + i107] = iZint_mod_small_signed;
                    int i114 = i106;
                    iArr[i93 + i111] = zint_mod_small_signed(iArr, i114, i97, i108, i109, i110, i113);
                    i107 = i111 + 1;
                    i106 = i114 + i97;
                    i105 = i112 + i97;
                    i96 = i109;
                    iModp_R3 = i110;
                    i104 = i108;
                    iModp_Rx2 = i113;
                    falconKeyGen2 = this;
                }
                int i115 = i104;
                int i116 = i96;
                i43 = i94;
                i97 = i97;
                modp_NTT2(iArr, i92, iArr, i43, i95, i115, i116);
                i44 = i92;
                modp_NTT2(iArr, i93, iArr, i43, i95, i115, i116);
                i45 = i93;
                i46 = i95;
                i47 = i116;
                i98 = i115;
            }
            int i117 = i45 + i39;
            int i118 = i117 + i54;
            int i119 = i15 + i86;
            int i120 = i64 + i86;
            int i121 = i119;
            int i122 = i120;
            int i123 = 0;
            while (i123 < i54) {
                iArr[i117 + i123] = iArr[i121];
                iArr[i118 + i123] = iArr[i122];
                i123++;
                i121 += i62;
                i122 += i62;
            }
            int i124 = i98;
            int i125 = i47;
            int i126 = i46 - 1;
            modp_NTT2(iArr, i117, iArr, i43, i126, i124, i125);
            int i127 = i118;
            modp_NTT2(iArr, i127, iArr, i43, i126, i124, i125);
            int i128 = i39;
            i68 = i43;
            int i129 = i119;
            int i130 = i120;
            int i131 = 0;
            while (i131 < i54) {
                int i132 = i131 << 1;
                int i133 = i44 + i132;
                int i134 = i131;
                int i135 = iArr[i133];
                int i136 = i127;
                int i137 = iArr[i133 + 1];
                int i138 = i45 + i132;
                int i139 = i129;
                int i140 = iArr[i138];
                int i141 = iArr[i138 + 1];
                int i142 = i130;
                int iModp_montymul = modp_montymul(iArr[i117 + i134], iModp_R3, i124, i125);
                int i143 = i46;
                int iModp_montymul2 = modp_montymul(iArr[i136 + i134], iModp_R3, i124, i125);
                iArr[i139] = modp_montymul(i141, iModp_montymul, i124, i125);
                iArr[i139 + i62] = modp_montymul(i140, iModp_montymul, i124, i125);
                iArr[i142] = modp_montymul(i137, iModp_montymul2, i124, i125);
                iArr[i142 + i62] = modp_montymul(i135, iModp_montymul2, i124, i125);
                i131 = i134 + 1;
                int i144 = i62 << 1;
                i129 = i139 + i144;
                i130 = i142 + i144;
                i127 = i136;
                i46 = i143;
            }
            int i145 = i46;
            int i146 = i42;
            modp_iNTT2_ext(iArr, i119, i62, iArr, i146, i145, i124, i125);
            falconKeyGen = this;
            falconKeyGen.modp_iNTT2_ext(iArr, i120, i62, iArr, i146, i145, i124, i125);
            i86++;
            i55 = i97;
            i85 = i41;
            falconSmallPrimeArr2 = falconSmallPrimeArr;
            i61 = i128;
            i52 = i145;
        }
        int i147 = i52;
        int i148 = i55;
        FalconSmallPrime[] falconSmallPrimeArr4 = falconSmallPrimeArr2;
        int i149 = i61;
        int i150 = i85;
        int i151 = i14;
        zint_rebuild_CRT(iArr, i15, i62, i62, i149, falconSmallPrimeArr4, 1, iArr, i68);
        zint_rebuild_CRT(iArr, i64, i62, i62, i149, falconSmallPrimeArr4, 1, iArr, i68);
        int i152 = i64;
        int i153 = i149;
        FalconFPR[] falconFPRArr = new FalconFPR[i153];
        FalconFPR[] falconFPRArr2 = new FalconFPR[i153];
        FalconFPR[] falconFPRArr3 = new FalconFPR[i153];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i54];
        FalconFPR[] falconFPRArr5 = new FalconFPR[i153];
        int i154 = i68;
        int[] iArr5 = new int[i153];
        int i155 = i148 > 10 ? 10 : i148;
        int i156 = (i150 + i148) - i155;
        FalconFPR[] falconFPRArr6 = falconFPRArr;
        poly_big_to_fp(falconFPRArr2, 0, iArr, i156, i155, i148, i147);
        int i157 = i155;
        poly_big_to_fp(falconFPRArr3, 0, iArr, (i67 + i148) - i157, i157, i148, i147);
        int i158 = i148;
        int i159 = (i158 - i157) * 31;
        int i160 = this.bitlength_avg[i151];
        int i161 = this.bitlength_std[i151];
        int i162 = i160 - (i161 * 6);
        int i163 = i160 + (i161 * 6);
        this.fft.FFT(falconFPRArr2, 0, i147);
        this.fft.FFT(falconFPRArr3, 0, i147);
        FalconKeyGen falconKeyGen3 = this;
        this.fft.poly_invnorm2_fft(falconFPRArr4, 0, falconFPRArr2, 0, falconFPRArr3, 0, i147);
        FalconFPR[] falconFPRArr7 = falconFPRArr2;
        FalconFPR[] falconFPRArr8 = falconFPRArr3;
        int i164 = i147;
        falconKeyGen3.fft.poly_adj_fft(falconFPRArr7, 0, i164);
        falconKeyGen3.fft.poly_adj_fft(falconFPRArr8, 0, i164);
        int i165 = i62 * 31;
        int i166 = i165 - i162;
        int i167 = i62;
        int i168 = 10;
        while (true) {
            int i169 = i164;
            int i170 = i167 > i168 ? i168 : i167;
            int i171 = i168;
            FalconKeyGen falconKeyGen4 = falconKeyGen3;
            FalconFPR[] falconFPRArr9 = falconFPRArr7;
            int i172 = i62;
            FalconFPR[] falconFPRArr10 = falconFPRArr8;
            FalconFPR[] falconFPRArr11 = falconFPRArr5;
            int i173 = i165;
            falconKeyGen4.poly_big_to_fp(falconFPRArr11, 0, iArr, (i15 + i167) - i170, i170, i172, i169);
            int i174 = i170;
            FalconFPR[] falconFPRArr12 = falconFPRArr6;
            poly_big_to_fp(falconFPRArr12, 0, iArr, (i152 + i167) - i174, i174, i172, i169);
            this.fft.FFT(falconFPRArr11, 0, i169);
            this.fft.FFT(falconFPRArr12, 0, i169);
            this.fft.poly_mul_fft(falconFPRArr11, 0, falconFPRArr9, 0, i169);
            this.fft.poly_mul_fft(falconFPRArr12, 0, falconFPRArr10, 0, i169);
            this.fft.poly_add(falconFPRArr12, 0, falconFPRArr11, 0, i169);
            this.fft.poly_mul_autoadj_fft(falconFPRArr12, 0, falconFPRArr4, 0, i169);
            this.fft.iFFT(falconFPRArr12, 0, i169);
            int i175 = (i166 - ((i167 - i170) * 31)) + i159;
            if (i175 < 0) {
                i175 = -i175;
                falconFPRFpr_sqr = this.fpr.fpr_two;
            } else {
                falconFPRFpr_sqr = this.fpr.fpr_onehalf;
            }
            FalconFPR falconFPRFpr_mul = this.fpr.fpr_one;
            while (i175 != 0) {
                if ((i175 & 1) != 0) {
                    falconFPRFpr_mul = this.fpr.fpr_mul(falconFPRFpr_mul, falconFPRFpr_sqr);
                }
                i175 >>= 1;
                falconFPRFpr_sqr = this.fpr.fpr_sqr(falconFPRFpr_sqr);
            }
            for (int i176 = 0; i176 < i153; i176++) {
                FalconFPR falconFPRFpr_mul2 = this.fpr.fpr_mul(falconFPRArr12[i176], falconFPRFpr_mul);
                FPREngine fPREngine = this.fpr;
                if (!fPREngine.fpr_lt(fPREngine.fpr_mtwo31m1, falconFPRFpr_mul2)) {
                    return 0;
                }
                FPREngine fPREngine2 = this.fpr;
                if (!fPREngine2.fpr_lt(falconFPRFpr_mul2, fPREngine2.fpr_ptwo31m1)) {
                    return 0;
                }
                iArr5[i176] = (int) this.fpr.fpr_rint(falconFPRFpr_mul2);
            }
            int i177 = i166 / 31;
            int i178 = i167;
            int i179 = i166 % 31;
            if (i151 <= 4) {
                int i180 = i150;
                i19 = i171;
                i16 = i172;
                int i181 = i158;
                i17 = i153;
                poly_sub_scaled_ntt(iArr, i15, i178, i16, iArr, i180, i181, i158, iArr5, 0, i177, i179, i169, iArr, i154);
                i18 = i180;
                i21 = i169;
                i22 = i152;
                iArr5 = iArr5;
                i23 = i181;
                i24 = i178;
                iArr2 = iArr;
                poly_sub_scaled_ntt(iArr2, i22, i24, i16, iArr, i67, i23, i181, iArr5, 0, i177, i179, i21, iArr, i154);
            } else {
                i16 = i172;
                i17 = i153;
                int i182 = i158;
                i18 = i150;
                i19 = i171;
                poly_sub_scaled(iArr, i15, i178, i16, iArr, i18, i182, i182, iArr5, 0, i177, i179, i169);
                i21 = i169;
                i22 = i152;
                i23 = i182;
                i24 = i178;
                iArr2 = iArr;
                poly_sub_scaled(iArr2, i22, i24, i16, iArr, i67, i23, i182, iArr5, 0, i177, i179, i21);
            }
            int i183 = i24;
            int i184 = i23;
            i164 = i21;
            int i185 = i166 + i163;
            int i186 = i185 + 10;
            if (i186 < i173) {
                if (i183 * 31 >= i185 + 41) {
                    i167 = i183 - 1;
                }
                if (i166 <= 0) {
                    if (i167 < i184) {
                        i29 = i15;
                        i31 = i22;
                        i32 = 0;
                        i25 = i17;
                        while (i32 < i25) {
                            i33 = (-(iArr2[(i29 + i167) - 1] >>> 30)) >>> 1;
                            for (i34 = i167; i34 < i184; i34++) {
                                iArr2[i29 + i34] = i33;
                            }
                            i35 = (-(iArr2[(i31 + i167) - 1] >>> 30)) >>> 1;
                            for (i36 = i167; i36 < i184; i36++) {
                                iArr2[i31 + i36] = i35;
                            }
                            i32++;
                            i29 += i16;
                            i31 += i16;
                        }
                    } else {
                        i25 = i17;
                    }
                    i26 = i15;
                    i27 = i26;
                    i28 = 0;
                    while (i28 < (i25 << 1)) {
                        System.arraycopy(iArr2, i26, iArr2, i27, i184);
                        i28++;
                        i27 += i184;
                        i26 += i16;
                    }
                    return 1;
                }
                i153 = i17;
                i37 = i166 - 25;
                if (i37 < 0) {
                    i166 = 0;
                } else {
                    i166 = i37;
                }
                falconKeyGen3 = this;
                i151 = i14;
                i152 = i22;
                i62 = i16;
                falconFPRArr6 = falconFPRArr12;
                i168 = i19;
                i150 = i18;
                falconFPRArr7 = falconFPRArr9;
                falconFPRArr8 = falconFPRArr10;
                falconFPRArr5 = falconFPRArr11;
                i158 = i184;
                i165 = i186;
            } else {
                i186 = i173;
            }
            i167 = i183;
            if (i166 <= 0) {
                if (i167 < i184) {
                    i29 = i15;
                    i31 = i22;
                    i32 = 0;
                    i25 = i17;
                    while (i32 < i25) {
                        i33 = (-(iArr2[(i29 + i167) - 1] >>> 30)) >>> 1;
                        while (i34 < i184) {
                            iArr2[i29 + i34] = i33;
                        }
                        i35 = (-(iArr2[(i31 + i167) - 1] >>> 30)) >>> 1;
                        while (i36 < i184) {
                            iArr2[i31 + i36] = i35;
                        }
                        i32++;
                        i29 += i16;
                        i31 += i16;
                    }
                } else {
                    i25 = i17;
                }
                i26 = i15;
                i27 = i26;
                i28 = 0;
                while (i28 < (i25 << 1)) {
                    System.arraycopy(iArr2, i26, iArr2, i27, i184);
                    i28++;
                    i27 += i184;
                    i26 += i16;
                }
                return 1;
            }
            i153 = i17;
            i37 = i166 - 25;
            if (i37 < 0) {
                i166 = 0;
            } else {
                i166 = i37;
            }
            falconKeyGen3 = this;
            i151 = i14;
            i152 = i22;
            i62 = i16;
            falconFPRArr6 = falconFPRArr12;
            i168 = i19;
            i150 = i18;
            falconFPRArr7 = falconFPRArr9;
            falconFPRArr8 = falconFPRArr10;
            falconFPRArr5 = falconFPRArr11;
            i158 = i184;
            i165 = i186;
        }
    }

    void zint_add_mul_small(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14) {
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i11 + i16;
            long unsignedLong = (toUnsignedLong(iArr2[i12 + i16]) * toUnsignedLong(i14)) + toUnsignedLong(iArr[i17]) + toUnsignedLong(i15);
            iArr[i17] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i15 = (int) (unsignedLong >>> 31);
        }
        iArr[i11 + i13] = i15;
    }

    void zint_add_scaled_mul_small(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16, int i17) {
        if (i14 == 0) {
            return;
        }
        int i18 = (-(iArr2[(i13 + i14) - 1] >>> 30)) >>> 1;
        int i19 = 0;
        int i21 = i16;
        int i22 = 0;
        while (i21 < i12) {
            int i23 = i21 - i16;
            int i24 = i23 < i14 ? iArr2[i13 + i23] : i18;
            int i25 = i11 + i21;
            long unsignedLong = (toUnsignedLong(i19 | ((i24 << i17) & Integer.MAX_VALUE)) * ((long) i15)) + toUnsignedLong(iArr[i25]) + ((long) i22);
            iArr[i25] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i22 = (int) (unsignedLong >>> 31);
            i21++;
            i19 = i24 >>> (31 - i17);
        }
    }

    int zint_bezout(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13, int[] iArr4, int i14, int i15, int[] iArr5, int i16) {
        FalconKeyGen falconKeyGen = this;
        int i17 = i15;
        int[] iArr6 = iArr5;
        if (i17 == 0) {
            return 0;
        }
        int i18 = i16 + i17;
        int i19 = i18 + i17;
        int i21 = i19 + i17;
        int iModp_ninv31 = falconKeyGen.modp_ninv31(iArr3[i13]);
        int iModp_ninv32 = falconKeyGen.modp_ninv31(iArr4[i14]);
        System.arraycopy(iArr3, i13, iArr6, i19, i17);
        System.arraycopy(iArr4, i14, iArr6, i21, i17);
        iArr[i11] = 1;
        iArr2[i12] = 0;
        for (int i22 = 1; i22 < i17; i22++) {
            iArr[i11 + i22] = 0;
            iArr2[i12 + i22] = 0;
        }
        System.arraycopy(iArr4, i14, iArr6, i16, i17);
        System.arraycopy(iArr3, i13, iArr6, i18, i17);
        iArr6[i18] = iArr6[i18] - 1;
        int i23 = 30;
        int i24 = (i17 * 62) + 30;
        while (i24 >= i23) {
            int i25 = -1;
            int i26 = i17;
            int i27 = -1;
            int i28 = 0;
            int i29 = 0;
            int i31 = 0;
            int i32 = 0;
            while (true) {
                int i33 = i26 - 1;
                if (i26 <= 0) {
                    break;
                }
                int i34 = iArr6[i19 + i33];
                int i35 = iArr6[i21 + i33];
                i29 ^= (i29 ^ i34) & i27;
                i28 ^= (i28 ^ i34) & i25;
                i32 ^= (i32 ^ i35) & i27;
                i31 ^= (i31 ^ i35) & i25;
                int i36 = ((((i34 | i35) + Integer.MAX_VALUE) >>> 31) - 1) & i27;
                int i37 = i27;
                i27 = i36;
                i25 = i37;
                i26 = i33;
            }
            int i38 = ~i25;
            int i39 = i29 & i38;
            long unsignedLong = (falconKeyGen.toUnsignedLong(i39) << 31) + falconKeyGen.toUnsignedLong(i28 | (i29 & i25));
            long unsignedLong2 = (falconKeyGen.toUnsignedLong(i32 & i38) << 31) + falconKeyGen.toUnsignedLong(i31 | (i32 & i25));
            int i41 = iArr6[i19];
            int i42 = iArr6[i21];
            long j11 = 0;
            int i43 = i19;
            int i44 = 0;
            long j12 = 0;
            long j13 = 1;
            long j14 = 1;
            for (int i45 = 31; i44 < i45; i45 = 31) {
                long j15 = unsignedLong2 - unsignedLong;
                int i46 = i44;
                int i47 = (int) ((j15 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j15))) >>> 63);
                int i48 = (i41 >> i46) & 1;
                int i49 = i48 & (i42 >> i46) & 1;
                int i51 = i49 & i47;
                int i52 = i49 & (~i47);
                int i53 = i51 | (i48 ^ 1);
                int i54 = i41 - ((-i51) & i42);
                long j16 = unsignedLong - ((-falconKeyGen.toUnsignedLong(i51)) & unsignedLong2);
                long j17 = -i51;
                long j18 = j13 - (j12 & j17);
                long j19 = j11 - (j14 & j17);
                int i55 = i42 - ((-i52) & i54);
                long j21 = unsignedLong2 - (j16 & (-falconKeyGen.toUnsignedLong(i52)));
                long j22 = -i52;
                long j23 = j12 - (j18 & j22);
                long j24 = j14 - (j19 & j22);
                i41 = i54 + ((i53 - 1) & i54);
                long j25 = i53;
                long j26 = j25 - 1;
                j13 = j18 + (j18 & j26);
                j11 = j19 + (j19 & j26);
                unsignedLong = j16 ^ ((j16 ^ (j16 >> 1)) & (-falconKeyGen.toUnsignedLong(i53)));
                i42 = i55 + ((-i53) & i55);
                long j27 = -j25;
                j12 = j23 + (j23 & j27);
                j14 = j24 + (j24 & j27);
                unsignedLong2 = j21 ^ (((j21 >> 1) ^ j21) & (falconKeyGen.toUnsignedLong(i53) - 1));
                i44 = i46 + 1;
                i18 = i18;
            }
            int i56 = i18;
            int i57 = i21;
            long j28 = j11;
            long j29 = j12;
            long j31 = j14;
            int iZint_co_reduce = falconKeyGen.zint_co_reduce(iArr5, i43, iArr5, i57, i15, j13, j28, j29, j31);
            long j32 = -(iZint_co_reduce & 1);
            long j33 = j13 - ((j13 + j13) & j32);
            long j34 = j28 - ((j28 + j28) & j32);
            long j35 = -(iZint_co_reduce >>> 1);
            long j36 = j29 - ((j29 + j29) & j35);
            long j37 = j31 - ((j31 + j31) & j35);
            falconKeyGen = this;
            iArr6 = iArr5;
            int i58 = iModp_ninv32;
            i17 = i15;
            falconKeyGen.zint_co_reduce_mod(iArr, i11, iArr6, i16, iArr4, i14, i17, i58, j33, j34, j36, j37);
            int i59 = iModp_ninv31;
            falconKeyGen.zint_co_reduce_mod(iArr2, i12, iArr6, i56, iArr3, i13, i17, i59, j33, j34, j36, j37);
            i24 -= 30;
            iModp_ninv32 = i58;
            i23 = 30;
            i19 = i43;
            i18 = i56;
            iModp_ninv31 = i59;
            i21 = i57;
        }
        int i61 = i19;
        int i62 = iArr5[i61] ^ 1;
        for (int i63 = 1; i63 < i17; i63++) {
            i62 |= iArr5[i61 + i63];
        }
        return (1 - ((i62 | (-i62)) >>> 31)) & iArr3[i13] & iArr4[i14];
    }

    int zint_co_reduce(int[] iArr, int i11, int[] iArr2, int i12, int i13, long j11, long j12, long j13, long j14) {
        long j15 = 0;
        int i14 = 0;
        long j16 = 0;
        while (i14 < i13) {
            int i15 = i11 + i14;
            int i16 = i12 + i14;
            int i17 = i14;
            long j17 = iArr[i15];
            long j18 = j17 * j11;
            long j19 = iArr2[i16];
            long j21 = j18 + (j19 * j12) + j15;
            long j22 = (j17 * j13) + (j19 * j14) + j16;
            if (i17 > 0) {
                iArr[i15 - 1] = ((int) j21) & Integer.MAX_VALUE;
                iArr2[i16 - 1] = ((int) j22) & Integer.MAX_VALUE;
            }
            j15 = j21 >> 31;
            j16 = j22 >> 31;
            i14 = i17 + 1;
        }
        iArr[(i11 + i13) - 1] = (int) j15;
        iArr2[(i12 + i13) - 1] = (int) j16;
        int i18 = (int) (j15 >>> 63);
        int i19 = (int) (j16 >>> 63);
        zint_negate(iArr, i11, i13, i18);
        zint_negate(iArr2, i12, i13, i19);
        return (i19 << 1) | i18;
    }

    void zint_co_reduce_mod(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13, int i14, int i15, long j11, long j12, long j13, long j14) {
        int i16 = iArr[i11];
        int i17 = iArr2[i12];
        int i18 = (((((int) j11) * i16) + (((int) j12) * i17)) * i15) & Integer.MAX_VALUE;
        int i19 = (((i16 * ((int) j13)) + (i17 * ((int) j14))) * i15) & Integer.MAX_VALUE;
        long j15 = 0;
        long j16 = 0;
        for (int i21 = 0; i21 < i14; i21++) {
            int i22 = i11 + i21;
            int i23 = i12 + i21;
            long j17 = iArr[i22];
            long j18 = iArr2[i23];
            int i24 = i13 + i21;
            long unsignedLong = (j17 * j11) + (j18 * j12) + (((long) iArr3[i24]) * toUnsignedLong(i18)) + j15;
            long unsignedLong2 = (j17 * j13) + (j18 * j14) + (((long) iArr3[i24]) * toUnsignedLong(i19)) + j16;
            if (i21 > 0) {
                iArr[i22 - 1] = ((int) unsignedLong) & Integer.MAX_VALUE;
                iArr2[i23 - 1] = ((int) unsignedLong2) & Integer.MAX_VALUE;
            }
            j15 = unsignedLong >> 31;
            j16 = unsignedLong2 >> 31;
        }
        long j19 = j15;
        iArr[(i11 + i14) - 1] = (int) j19;
        iArr2[(i12 + i14) - 1] = (int) j16;
        zint_finish_mod(iArr, i11, i14, iArr3, i13, (int) (j19 >>> 63));
        zint_finish_mod(iArr2, i12, i14, iArr3, i13, (int) (j16 >>> 63));
    }

    void zint_finish_mod(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14) {
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            i15 = ((iArr[i11 + i16] - iArr2[i13 + i16]) - i15) >>> 31;
        }
        int i17 = (-i14) >>> 1;
        int i18 = -((1 - i15) | i14);
        for (int i19 = 0; i19 < i12; i19++) {
            int i21 = i11 + i19;
            int i22 = (iArr[i21] - ((iArr2[i13 + i19] ^ i17) & i18)) - i14;
            iArr[i21] = Integer.MAX_VALUE & i22;
            i14 = i22 >>> 31;
        }
    }

    int zint_mod_small_signed(int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i12 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i11, i12, i13, i14, i15), (-(iArr[(i11 + i12) - 1] >>> 30)) & i16, i13);
    }

    int zint_mod_small_unsigned(int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        int iModp_add = 0;
        while (true) {
            int i16 = i12 - 1;
            if (i12 <= 0) {
                return iModp_add;
            }
            int iModp_montymul = modp_montymul(iModp_add, i15, i13, i14);
            int i17 = iArr[i11 + i16] - i13;
            iModp_add = modp_add(iModp_montymul, i17 + ((-(i17 >>> 31)) & i13), i13);
            i12 = i16;
        }
    }

    int zint_mul_small(int[] iArr, int i11, int i12, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i11 + i15;
            long unsignedLong = (toUnsignedLong(iArr[i16]) * toUnsignedLong(i13)) + ((long) i14);
            iArr[i16] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i14 = (int) (unsignedLong >> 31);
        }
        return i14;
    }

    void zint_negate(int[] iArr, int i11, int i12, int i13) {
        int i14 = (-i13) >>> 1;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i11 + i15;
            int i17 = (iArr[i16] ^ i14) + i13;
            iArr[i16] = Integer.MAX_VALUE & i17;
            i13 = i17 >>> 31;
        }
    }

    void zint_norm_zero(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        int i14 = 0;
        int i15 = i13;
        int i16 = 0;
        while (true) {
            int i17 = i15 - 1;
            if (i15 <= 0) {
                zint_sub(iArr, i11, iArr2, i12, i13, i14 >>> 31);
                return;
            }
            int i18 = iArr[i11 + i17];
            int i19 = iArr2[i12 + i17];
            int i21 = ((i16 << 30) | (i19 >>> 1)) - i18;
            i14 |= ((-(i21 >>> 31)) | ((-i21) >>> 31)) & ((i14 & 1) - 1);
            i15 = i17;
            i16 = i19 & 1;
        }
    }

    int zint_one_to_plain(int[] iArr, int i11) {
        int i12 = iArr[i11];
        return i12 | ((1073741824 & i12) << 1);
    }

    void zint_rebuild_CRT(int[] iArr, int i11, int i12, int i13, int i14, FalconSmallPrime[] falconSmallPrimeArr, int i15, int[] iArr2, int i16) {
        FalconKeyGen falconKeyGen = this;
        int i17 = 0;
        iArr2[i16] = falconSmallPrimeArr[0].f99063p;
        int i18 = 1;
        int i19 = i12;
        while (true) {
            int i21 = i18;
            if (i21 >= i19) {
                break;
            }
            FalconSmallPrime falconSmallPrime = falconSmallPrimeArr[i21];
            int i22 = falconSmallPrime.f99063p;
            int i23 = falconSmallPrime.f99064s;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i22);
            int iModp_R2 = falconKeyGen.modp_R2(i22, iModp_ninv31);
            int i24 = i11;
            int i25 = 0;
            while (i25 < i14) {
                int i26 = i22;
                int i27 = iModp_ninv31;
                int i28 = iModp_R2;
                int iModp_montymul = falconKeyGen.modp_montymul(i23, falconKeyGen.modp_sub(iArr[i24 + i21], falconKeyGen.zint_mod_small_unsigned(iArr, i24, i21, i22, iModp_ninv31, iModp_R2), i26), i26, i27);
                int i29 = i21;
                falconKeyGen.zint_add_mul_small(iArr, i24, iArr2, i16, i29, iModp_montymul);
                i25++;
                i24 += i13;
                i21 = i29;
                i22 = i26;
                iModp_ninv31 = i27;
                iModp_R2 = i28;
            }
            int i31 = i21;
            iArr2[i16 + i31] = falconKeyGen.zint_mul_small(iArr2, i16, i31, i22);
            i18 = i31 + 1;
        }
        if (i15 != 0) {
            int i32 = i11;
            while (i17 < i14) {
                falconKeyGen.zint_norm_zero(iArr, i32, iArr2, i16, i19);
                i17++;
                i32 += i13;
                falconKeyGen = this;
                i19 = i12;
            }
        }
    }

    int zint_sub(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14) {
        int i15 = -i14;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = i11 + i17;
            int i19 = iArr[i18];
            int i21 = (i19 - iArr2[i12 + i17]) - i16;
            i16 = i21 >>> 31;
            iArr[i18] = i19 ^ (((i21 & Integer.MAX_VALUE) ^ i19) & i15);
        }
        return i16;
    }

    void zint_sub_scaled(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16) {
        if (i14 == 0) {
            return;
        }
        int i17 = (-(iArr2[(i13 + i14) - 1] >>> 30)) >>> 1;
        int i18 = 0;
        int i19 = i15;
        int i21 = 0;
        while (i19 < i12) {
            int i22 = i19 - i15;
            int i23 = i22 < i14 ? iArr2[i22 + i13] : i17;
            int i24 = i11 + i19;
            int i25 = (iArr[i24] - (i18 | ((i23 << i16) & Integer.MAX_VALUE))) - i21;
            iArr[i24] = i25 & Integer.MAX_VALUE;
            i21 = i25 >>> 31;
            i19++;
            i18 = i23 >>> (31 - i16);
        }
    }
}
