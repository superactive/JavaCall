#include "clslib.h"

class ClsImpl : public ClsApi {
public:
    virtual void init() {}
    virtual void registerSpi(ClsSpi *spi) {
       mSpi = spi;
    }

    virtual int reqLogin(int loginId) {
        mSpi->onLogin(loginId);
        return 0;
    }
private:
   ClsSpi *mSpi;
};

ClsApi *ClsApi::create() {
    return new ClsImpl;
}

void ClsApi::destroy(ClsApi *api) {
    delete api;
}
