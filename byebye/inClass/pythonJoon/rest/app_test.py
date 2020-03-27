from app import app

def test_home(client):
    client = app.test_client()

    response = client.get('/')
    assert response.status_code == 200
    assert '"test":"hi~"' in str(response.data)

    data = response.get_json()
    oldCount = data['count']

    for i in range(5):
        response = client.get('/')
        assert response.status_code == 200

        data = response.get_json()
        newCount = data['count']

        assert newCount == oldCount + i + 1


# assert b'hi~' in response.data #b=바이너리