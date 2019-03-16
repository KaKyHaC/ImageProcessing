//package domain.module.dct.algorithms;
//
//import static java.lang.Math.cos;
//import static java.lang.Math.sqrt;
//import static java.lang.StrictMath.sin;
//
//public class Dct2D {
//    private static final double M_PI = 3.1415;
//    void DFCTrr(double []dst,double []src,double []tmp,int n)
//    {
//        // exact normalized DCT II by N DFFT
//        int i,j;
//        double nn=n,a,da=(M_PI*(nn-0.5))/nn,a0,b0,a1,b1,m;
//        for (j=  0,i=n-1;i>=0;i-=2,j++) dst[j]=src[i];
//        for (j=n-1,i=n-2;i>=0;i-=2,j--) dst[j]=src[i];
//        DFFTcr(tmp,dst,n);
//        m=2.0*sqrt(2.0);
//        for (a=0.0,j=0,i=0;i<n;i++,j+=2,a+=da)
//        {
//            a0=tmp[j+0]; a1= cos(a);
//            b0=tmp[j+1]; b1=-sin(a);
//            a0=(a0*a1)-(b0*b1);
//            if (i) a0*=m; else a0*=2.0;
//            dst[i]=a0;
//        }
//    }
//    //---------------------------------------------------------------------------
//    void iDFCTrr(double *dst,double *src,double *tmp,int n)
//    {
//        // exact normalized DCT III = iDCT II by N iDFFT
//        int i,j;
//        double nn=n,a,da=(M_PI*(nn-0.5))/nn,a0,m,aa,bb;
//        m=1.0/sqrt(2.0);
//        for (a=0.0,j=0,i=0;i<n;i++,j+=2,a+=da)
//        {
//            a0=src[i];
//            if (i) a0*=m;
//            aa= cos(a)*a0;
//            bb=+sin(a)*a0;
//            tmp[j+0]=aa;
//            tmp[j+1]=bb;
//        }
//        m=src[0]*0.25;
//        iDFFTrc(src,tmp,n);
//        for (j=  0,i=n-1;i>=0;i-=2,j++) dst[i]=src[j]-m;
//        for (j=n-1,i=n-2;i>=0;i-=2,j--) dst[i]=src[j]-m;
//    }
////-------------------------------------------------------------
//}
