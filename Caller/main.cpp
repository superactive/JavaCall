#include <iostream>
#include <string>

#include "clslib.h"

class Spi : public ClsSpi {
public:
    virtual void onLogin(int loginId) {
        std::cout << "onlogin called with " << loginId << std::endl;
    }
};

int main(int argc, char *argv[]) {
    Spi *spi = new Spi;
    ClsApi *api = ClsApi::create();
    api->registerSpi(spi);
    api->reqLogin(2);
    ClsApi::destroy(api);
    delete spi;
    return 0;
}
