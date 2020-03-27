import logging

logger = logging.getLogger('myApp')
hand = logging.FileHandler('myapp_20200212.log')

#                               생성시간,       로그레벨,   프로세스id,     메시지
formatter = logging.Formatter('%(asctime)s %(levelname)s %(process)d %(message)s')

# 파일핸들러에 문자열 포메터를 등록
hand.setFormatter(formatter)

logger.addHandler(hand)

logger.setLevel(logging.INFO)

logger.debug('xdxexbxuxgx')
logger.info('check plz')
logger.warning('@w@a@r@i@n@g@')
logger.error('eeeeeeeeee')
logger.critical('OTL...')