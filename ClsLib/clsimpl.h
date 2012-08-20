#ifndef CLSIMPL_H
#define CLSIMPL_H

#include "clslib.h"

class ClsImpl : public ClsApi {
public:
    virtual void init() {}
    virtual void registerSpi(ClsSpi *spi) {
       mSpi = spi;
    }

    virtual int reqLogin(int loginId) {
        mSpi->onLogin(loginId);
    }
private:
   ClsSpi *mSpi;
};

#endif // CLSIMPL_H
